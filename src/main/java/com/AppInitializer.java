package com;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.config.SpringMvcConfig;
import com.config.SpringRootConfig;

public class AppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringRootConfig.class };
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringMvcConfig.class };
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
