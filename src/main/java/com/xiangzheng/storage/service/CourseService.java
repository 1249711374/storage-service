package com.xiangzheng.storage.service;

import com.baomidou.mybatisplus.service.IService;
import com.xiangzheng.storage.entity.Course;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gaohaoyou
 * @since 2020-06-03
 */
public interface CourseService extends IService<Course> {

    List<Course> findAll();

}
