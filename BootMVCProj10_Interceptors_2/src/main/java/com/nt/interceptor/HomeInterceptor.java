package com.nt.interceptor;

import java.io.IOException;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HomeInterceptor implements HandlerInterceptor {
     
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws IOException {
		System.out.println("Inside PreHandler");
		System.out.println(request.getContextPath());
	    if(request.getServletPath().equals("/info")) {
	    	System.out.println("Inside PreHandler  if");
	    	
	    	 response.setContentType("text/html");

	    	    response.getWriter().println("<h1>Invalid Operation</h1>");
	    	    response.getWriter().println("<h2>Please Login First</h2>");
	    	return false;	
	    }
	    else {
	    	return true;
	    }
	    
	}
}
