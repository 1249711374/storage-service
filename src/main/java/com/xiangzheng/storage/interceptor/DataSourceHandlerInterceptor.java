package com.xiangzheng.storage.interceptor;

import com.xiangzheng.storage.config.dbconfig.DBContextHolder;
import com.xiangzheng.storage.config.dbconfig.DynamicDataSource;
import com.xiangzheng.storage.entity.DataSource;
import com.xiangzheng.storage.mapper.DataSourceMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/***
 * 自动切换数据源拦截器
 */
public class DataSourceHandlerInterceptor  implements HandlerInterceptor {
    @Autowired
    private DataSourceMapper dataSourceMapper;

    @Autowired
    private DynamicDataSource dynamicDataSource;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        if(dataSourceMapper==null){
            dataSourceMapper = factory.getBean(DataSourceMapper.class);
        }
        if(dynamicDataSource==null){
            dynamicDataSource = factory.getBean(DynamicDataSource.class);
        }
        List<DataSource> list=dataSourceMapper.get();
        DataSource d = list.get(1);
        //创建数据源
        try {
            dynamicDataSource.createDataSourceWithCheck(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //切换数据源
        DBContextHolder.setDataSource(d.getDatasourceId());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
