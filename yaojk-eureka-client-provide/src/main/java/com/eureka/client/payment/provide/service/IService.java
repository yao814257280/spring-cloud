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

package com.eureka.client.payment.provide.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 通用接口
 */
@Service
public interface IService<T> {

    /**
     * 查询全部
     */
    List<T> selectAll();

    /**
     * 统计数量
     * @param entity 不为null的字段为筛选条件,且用等号(=)查询
     */
    int selectCount(T entity);

    /**
     * 用主键查询,model中必须有主键注解字段(@Id)
     * @param key 主键
     */
    T selectByKey(Object key);

    /**
     * 查询一个结果,如果有多个返回则抛异常
     * @param entity 不为null的字段为筛选条件,且用等号(=)查询
     */
    T selectOne(T entity);

    /**
     * 查询多个结果
     * @param entity 不为null的字段为筛选条件,且用等号(=)查询
     */
    List<T> select(T entity);

    /**
     * 插入一条记录
     * @param entity 不为null的字段将被插入到数据库
     */
    int insert(T entity);

    /**
     * 插入一条记录,并获取自增ID
     * @param entity 不为null的字段将被插入到数据库
     */
    int insertUseGeneratedKey(T entity);

    /**
     * 用主键删除一条记录,model中必须有主键注解字段(@Id)
     * @param key 主键
     * @return
     */
    int deleteByKey(Object key);

    /**
     * 自定义删除条件
     * @param entity
     * @return
     */
    int delete(T entity);

    /**
     * 用主键更新一条记录,model中必须有主键注解字段(@Id)
     * @param entity 主键字段不能为空,其它不为null的字段将被更新
     */
    int updateByKey(T entity);

    /**
     * 按条件查询
     * @param example 条件
     */
    List<T> selectByExample(Object example);

    /**
     * 按条件统计数量
     * @param example 条件
     */
    int selectCountByExample(Object example);
}
