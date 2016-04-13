package com.future.api.category.web;

import com.future.api.category.domain.Category;
import com.future.api.category.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * CategoryController
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@RestController
@RequestMapping("/api")
public class CategoryController {

    private final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    private CategoryService categoryService;

    /**
     * create a new category
     * @param category
     * @return
     */
    @RequestMapping(value = "/category",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody Category category){
        logger.debug("REST request to create a new category");
        return new ResponseEntity<>(categoryService.save(category), HttpStatus.OK);
    }

    /**
     * update the id category
     * @param category
     * @return
     */
    @RequestMapping(value = "/category",method = RequestMethod.PUT ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> update(@RequestBody Category category){
        logger.debug("REST request to update category");
        if(category.getId() == null){
            return create(category);
        }else{
            return new ResponseEntity<>(categoryService.save(category),HttpStatus.OK);
        }
    }

    /**
     * get all the categories
     * @return
     */
    @RequestMapping(value = "/category",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll(){
        logger.debug("REST request to get all categories");
        List<Category> categoryList = categoryService.findAll();
        if(categoryList != null && categoryList.size()>0){
            return new ResponseEntity<>(categoryList,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * get the id category
     * @param id
     * @return
     */
    @RequestMapping(value = "/category/{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getOne(@PathVariable String id){
        logger.debug("REST request to get the id:{id} category",id);
        Category category = categoryService.findOne(id);
        if(category != null){
            return new ResponseEntity<>(category,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
