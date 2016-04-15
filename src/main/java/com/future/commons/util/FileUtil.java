package com.future.commons.util;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * FileUtil
 *
 * @author Eric.guo
 * @date 2016/4/11 0011
 */
public class FileUtil {

    public static Logger logger = Logger.getLogger(FileUtil.class);

    /**
     * upload files
     *
     * @param file
     * @param path
     * @param fileName
     * @return
     * @throws Exception
     */
    public static final boolean upload(MultipartFile file, String path, String fileName) throws Exception {

        File targetFile = new File(path, fileName);
        String newPath = path + "/" + fileName;
        mkdirFolder(path);
        if (!isExist(newPath)) {
            file.transferTo(targetFile);
            return true;
        } else
            return false;
    }

    /**
     * download file
     *
     * @param path
     * @param fileName
     */
    public static final void downloadNet(String path, String fileName, HttpServletResponse response) throws Exception {

        int bytesum = 0;
        int byteread = 0;

        URL url = new URL("windine.blogdriver.com/logo.gif");

        URLConnection conn = url.openConnection();
        InputStream inStream = conn.getInputStream();
        FileOutputStream fs = new FileOutputStream(path + fileName);

        byte[] buffer = new byte[1204];
        while ((byteread = inStream.read(buffer)) != -1) {
            bytesum += byteread;
            fs.write(buffer, 0, byteread);
        }
    }

    public static final void downloadLocal(String path, String fileName, HttpServletResponse response) throws Exception {
        // 文件的存放路径
        File file = new File(path+"/"+fileName);
        // 读到流中
        InputStream is = new FileInputStream(file);
        // 设置输出的格式
        response.reset();
        response.setContentType("application/octet-stream");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        // 循环取出流中的数据
        OutputStream os = response.getOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) > 0){
            os.write(buffer, 0, len);
        }
        os.flush();
        os.close();
        is.close();
    }

    /**
     * Judge whether a file exists
     * @param filePath
     * @return
     */
    public static boolean isExist(String filePath) {
        File file = null;
        boolean bool = false;
        try {
            file = new File(filePath);
            bool = file.exists();
        } catch (Exception e) {
            e.printStackTrace();
            bool = false;
        }
        return bool;
    }

    /**
     * Make dir Folder
     *
     * @param strFilePath
     *
     */
    public static boolean mkdirFolder(String strFilePath) {
        boolean bool = false;
        try {
            File file = new File(strFilePath.toString());
            if (!file.exists()) {
                bool = file.mkdirs();
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
