package com.nt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.nt.interceptor.HomeInterceptor;

@Configuration
public class HomeInterceptorRegistar implements WebMvcConfigurer {
	
  @Override	
  public void addInterceptors(InterceptorRegistry registry) {
	  registry.addInterceptor(new HomeInterceptor());
  }
}
