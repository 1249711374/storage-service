package com.xiangzheng.storage.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.xiangzheng.storage.entity.Course;
import com.xiangzheng.storage.mapper.CourseMapper;
import com.xiangzheng.storage.service.CourseService;
import org.springframework.stereotype.Service;

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

}
