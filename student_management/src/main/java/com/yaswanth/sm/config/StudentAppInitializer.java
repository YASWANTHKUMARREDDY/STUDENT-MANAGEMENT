/**
 * 
 */
package com.yaswanth.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Yaswanth Kumar Reddy Poola
 *
 *
 */
public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] configFiles = { StudentAppConfig.class };
		
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mappings = { "/" };

		return mappings;
	}

}
