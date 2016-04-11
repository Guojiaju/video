package com.future.api.image.web;

import com.future.api.image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * ImageController
 *
 * @author Eric.guo
 * @date 2016/4/11 0011
 */
@RestController
@RequestMapping("/api")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping(value = "/images",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(MultipartFile[] files){
        return null;
    }
}
