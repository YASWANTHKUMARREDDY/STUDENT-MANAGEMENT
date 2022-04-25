/**
 * 
 */
package com.yaswanth.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Yaswanth Kumar Reddy Poola
 *
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.yaswanth" })
public class StudentAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolverMethod() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}
}
