/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.eureka.client.payment.provide.service.impl;

import com.eureka.client.payment.provide.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 通用实现类
 */
public abstract class BaseService<T> implements IService<T> {

    protected Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int selectCount(T entity) {
        return mapper.selectCount(entity);
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public List<T> select(T entity) {
        return mapper.select(entity);
    }

    @Override
    public int insert(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int insertUseGeneratedKey(T entity) {
        // 如果该mapper没有继承InsertSelectiveUseGeneratedKeysMapper接口,则调用insertSelective方法,不会返回自增主键
//        if (mapper instanceof InsertSelectiveUseGeneratedKeysMapper) {
//            return ((InsertSelectiveUseGeneratedKeysMapper) mapper).insertSelectiveUseGeneratedKeys(entity);
//        } else {
//            LOG.debug("没有继承InsertSelectiveUseGeneratedKeysMapper接口");
            return insert(entity);
//        }
    }

    @Override
    public int deleteByKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int delete(T entity) {
        return mapper.delete(entity);
    }

    @Override
    public int updateByKey(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }
}
