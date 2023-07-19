package com.zieta1;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/MyServlet")
public class MyFilter extends HttpFilter implements Filter {
       public FilterConfig config;
   
    public MyFilter() {
        System.out.println("In Constructor");
    }

    public void init(FilterConfig fConfig) throws ServletException {
		this.config=config;
		System.out.println("In init");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In DoFilter");
		chain.doFilter(request, response);
	}

	public void destroy() {
		config=null;
		System.out.println("In Destroy");
	}
	

}
