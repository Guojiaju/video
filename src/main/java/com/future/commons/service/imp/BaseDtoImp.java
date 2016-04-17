package com.future.commons.service.imp;

import com.future.commons.service.BaseDtoService;

/**
 * BaseDtoImp
 *
 * @author Eric.guo
 * @date 2016/4/16 19:27
 */
public class BaseDtoImp<T> implements BaseDtoService {

    @Override
    public T toEntity(Object dto) {
        return null;
    }

    @Override
    public T toDto(Object entity) {
        return null;
    }
}
