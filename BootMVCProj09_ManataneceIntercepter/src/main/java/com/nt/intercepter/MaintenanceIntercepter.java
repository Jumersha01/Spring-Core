package com.nt.intercepter;

import java.time.LocalTime;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaintenanceIntercepter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		int hour = LocalTime.now().getHour();
		if(hour>=16 && hour<17) {
			response.sendRedirect(request.getContextPath()+"/error.jsp");
			log.info("preHandle false condintion Executed");
			return false;
		}
		log.info("preHandle true condintion Executed");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		log.info("post Handler Executed");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
		log.info("afterCompletion Handler Executed");
	}
}
