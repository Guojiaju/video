package com.future.commons.util;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * FileUtil
 *
 * @author Eric.guo
 * @date 2016/4/11 0011
 */
public class FileUtil {

    public static Logger logger = Logger.getLogger(FileUtil.class);

    public static final String upload(MultipartFile file , String path){

        return null;
    }

    /**
     * Judge whether a file exists
     * @param filePath
     * @return
     */
    public static boolean isExist(String filePath) {
        File file = null;
        boolean boo = false;
        try {
            file = new File(filePath);
            boo = file.exists();
        } catch (Exception e) {
            e.printStackTrace();
            boo = false;
        }
        return boo;
    }

    /**
     * Make dir Folder
     *
     * @param strFilePath
     *
     */
    public boolean mkdirFolder(String strFilePath) {
        boolean bool = false;
        try {
            File file = new File(strFilePath.toString());
            if (!file.exists()) {
                bool = file.mkdir();
            }
        } catch (Exception e) {
            logger.error("Create folder failure" + e.getLocalizedMessage());
            e.printStackTrace();
        }
        return bool;
    }

    /**
     * Remove file
     *
     * @param strFilePath
     * @return
     */
    public static boolean removeFile(String strFilePath) {
        boolean bool = false;
        if (strFilePath == null || "".equals(strFilePath)) {
            return bool;
        }
        File file = new File(strFilePath);
        if (file.isFile() && file.exists()) {
            bool = file.delete();
            if (bool == Boolean.TRUE) {
                logger.debug("[REMOE_FILE:" + strFilePath + "Remove successfully !]");
            } else {
                logger.debug("[REMOE_FILE:" + strFilePath + "Remove failure !]");
            }
        }
        return bool;
    }

    /**
     * Remove folder
     *
     * @param strFolderPath
     * @return
     */
    public static boolean removeFolder(String strFolderPath) {
        boolean bool = false;
        try {
            if (strFolderPath == null || "".equals(strFolderPath)) {
                return bool;
            }
            File file = new File(strFolderPath.toString());
            bool = file.delete();
            if (bool == Boolean.TRUE) {
                logger.debug("[REMOE_FOLDER:" + file.getPath() + "Remove successfully !]");
            } else {
                logger.debug("[REMOE_FOLDER:" + file.getPath() + "Remove failure]");
            }
        } catch (Exception e) {
            logger.error("FLOADER_PATH:" + strFolderPath + "Remove folder failure!");
            e.printStackTrace();
        }
        return bool;
    }

}
