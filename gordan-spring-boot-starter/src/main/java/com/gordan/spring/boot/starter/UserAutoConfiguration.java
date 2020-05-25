package com.gordan.spring.boot.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gordan.service.UserService;

@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfiguration {	
	@Bean
	public UserService getBean(UserProperties userProperties) {
		//创建组件实例
		UserService userService=new UserService();
		userService.setUsername(userProperties.getUsername());
		userService.setPassword(userProperties.getPassword());
		return userService;
	}
}
