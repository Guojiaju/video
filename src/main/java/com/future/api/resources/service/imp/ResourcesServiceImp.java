package com.future.api.resources.service.imp;

import com.future.api.resources.dao.ResourcesMapper;
import com.future.api.resources.domain.Resources;
import com.future.api.resources.domain.ResourcesCriteria;
import com.future.api.resources.service.ResourcesService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.imp.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ResourcesServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@Service
public class ResourcesServiceImp extends BaseServiceImpl<Resources,ResourcesCriteria> implements ResourcesService {

    @Autowired
    private ResourcesMapper resourcesDao;

    @Override
    protected BaseDao<Resources, ResourcesCriteria, String> getDao() {
        return resourcesDao;
    }
}
