package com.xiangzheng.storage.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xiangzheng.storage.entity.Course;
import com.xiangzheng.storage.mapper.CourseMapper;
import com.xiangzheng.storage.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gaohaoyou
 * @since 2020-06-03
 */
@Service
public class CourseServiceImap extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Autowired
    private CourseMapper courseMapper;


    @Override
    public List<Course> findAll() {
        return courseMapper.selectList(null);
    }
}
