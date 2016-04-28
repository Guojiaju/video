package com.future.api.image.web;

import com.future.api.image.domain.Image;
import com.future.api.image.service.ImageService;
import com.future.commons.util.FileUtil;
import com.future.commons.util.IdGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * ImageController
 *
 * @author Eric.guo
 * @date 2016/4/11 0011
 */
@RestController
@RequestMapping("/api")
public class ImageController {
    private static Logger log = LoggerFactory.getLogger(ImageController.class);
    @Autowired
    private ImageService imageService;

    @Value("${spring.file.path}")
    private String path;

    @RequestMapping(value = "/images",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> upload(@RequestParam("files") MultipartFile[] files){
        log.debug("REST request to upload files");
        List<Image> images = new ArrayList<>();
        if(files != null && files.length >0){
            for(MultipartFile multipartFile : files){
                String id = IdGen.uuid();
                String originName = multipartFile.getOriginalFilename();
                String type = originName.substring(originName.lastIndexOf("."),originName.length());
                String newName = id + type;
                try {
                    if(FileUtil.upload(multipartFile,path,newName)){
                        Image image = new Image();
                        image.setId(id);
                        image.setType(type);
                        image.setImageName(newName);
                        image.setLocalPath(path);
                        image.setUrl("/api/images");
                        image.setCreatedBy("");
                        images.add(imageService.insert(image));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return new ResponseEntity<>(images,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No files",HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * download the id image
     */
    @RequestMapping(value = "/images/download/{id}",method = RequestMethod.GET)
    public void download(@PathVariable String id ,HttpServletResponse response){
        log.debug("REST request to download the id:{id} image",id);
        Image image = imageService.findOne(id);
        try {
            FileUtil.downloadLocal(image.getLocalPath(), image.getImageName(), response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * get all images
     * @return
     */
    @RequestMapping(value ="/images", method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        log.debug("REST request to get all images");
        List<Image> images = imageService.findAll();
        if(images !=null && images.size()>0){
            return new ResponseEntity<>(images,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * get the id image
     * @param id
     * @return
     */
    @RequestMapping(value = "/images/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOne(@PathVariable String id){
        log.debug("REST request to get the id:{id} image",id);
        Image image = imageService.findOne(id);
        if(image != null && !image.equals("")){
            return new ResponseEntity<>(image,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    /**
     * delete the ids images
     * @param ids
     * @return
     */
    @RequestMapping(value = "/images",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@RequestParam("ids") String[] ids) {
        log.debug("REST request to delete ids:{}", ids);
        if (ids != null && ids.length > 0) {
            for (String id : ids) {
                Image image = imageService.findOne(id);
                if (FileUtil.removeFile(image.getLocalPath() + "/" + image.getImageName())) {
                    imageService.delete(id);
                } else
                    return new ResponseEntity<>("The id:" + id +"delete failed",HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
