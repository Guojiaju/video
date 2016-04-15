package com.future.api.image.service.imp;

import com.future.api.image.dao.ImageMapper;
import com.future.api.image.domain.Image;
import com.future.api.image.domain.ImageCriteria;
import com.future.api.image.service.ImageService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * ImageServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/11 0011
 */
@Service
@Transactional
public class ImageServiceImp extends BaseServiceImpl<Image,ImageCriteria> implements ImageService {

    @Autowired
    private ImageMapper imageDao;

    @Override
    protected BaseDao<Image, ImageCriteria, String> getDao() {
        return imageDao;
    }

    @Override
    public Image insert(Image image) {
        Assert.notNull(image);
        if(image.getId() == null){
            this.save(image);
        }else{
            imageDao.insert(image);
        }
        return image;
    }
}
