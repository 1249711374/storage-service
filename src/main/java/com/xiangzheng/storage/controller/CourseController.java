package com.xiangzheng.storage.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xiangzheng.storage.service.CourseService;
import com.xiangzheng.storage.tools.ResponseAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gaohaoyou
 * @since 2020-06-03
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/")
    public ResponseAPI selectCourse(){
        return new ResponseAPI(ResponseAPI.SUCCESS_CODE,ResponseAPI.SUCCESS_FLAG,"查询成功",courseService.selectList(new EntityWrapper<>()));
    }

}

