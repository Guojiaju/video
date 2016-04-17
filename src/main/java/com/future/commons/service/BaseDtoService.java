package com.future.commons.service;


/**
 * BaseDtoService
 *
 * @author Eric.guo
 * @date 2016/4/16 19:23
 */
public interface BaseDtoService<T>{

    T toEntity(T dto);

    T toDto(T entity);
}
