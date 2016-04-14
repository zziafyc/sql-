package com.zzia.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//利用过滤器解决乱码问题
public class MyFilter implements Filter {
	String code="utf-8";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(code);
		response.setContentType("text/html;charset="+code);
		
		response.setCharacterEncoding(code);
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		code=filterConfig.getInitParameter("code"); //调用了xml中配置的code
		
	}

}
