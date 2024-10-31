package com.pathy.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pathy.common.interceptor.CheckLoginSessionInterceptor;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer{
	
	 @Override
	    public void addInterceptors(InterceptorRegistry registry) {
			registry.addInterceptor(new CheckLoginSessionInterceptor())
//					.order(1)
					.addPathPatterns("/xdm/v1/infra/**")
					.excludePathPatterns(
							"/resources/**",
//							"/adt/**",
//							"/xdm/**",
							"/xdm/v1/infra/index/signinXdmView",
							"/xdm/v1/infra/member/signinXdmProc"
							
			);	
			
		}
	
}
