package com.xiangzheng.storage.filter;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Order(1)
@WebFilter(urlPatterns = "/*", filterName = "corsFilter")
public class CorsFilter implements Filter {

	private static  final Logger log = (Logger) LoggerFactory.getLogger(CorsFilter.class);

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("__________跨域过滤器已执行");

		log.info("__________跨域过滤器已执行");
	}


	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials","true");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Token, Origin, X-Requested-With, Accept, x-user-id, x-access-token, x-platform, x-client-token," +
				" x-system-version, x-client-version, x-method-version, x-network-type, x-domain, x-visitor-mode, x-storesys-id, x-tea-id");
		response.setHeader("access-control-expose-headers", "Authorization");
		//response.setHeader("authorization","*");
		System.out.println("__________跨域过滤器已处理");
		chain.doFilter(req, res);

	}


	public void destroy() {

	}


}
