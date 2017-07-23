package com.sfc.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext context) throws ServletException {
		Dynamic registration = context.addServlet("dispatcher",
				new DispatcherServlet());
		registration.addMapping("*.htm");
		registration.setLoadOnStartup(2);
	}

}
