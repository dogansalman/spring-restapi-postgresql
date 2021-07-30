package com.restapi;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class initializer extends SpringBootServletInitializer {
	
	public static void main(String[] args)  {


		// SpringApplication nesnesi yaratiliyor.
		SpringApplication app = new SpringApplication(initializer.class);
		app.setWebApplicationType(WebApplicationType.SERVLET);
				
				
		// Varsayilan port icin obje yaratiliyor.
		Map<String, Object> properties = new HashMap<>();
		properties.put("server.port", "9599");
		properties.put("hibernate.hbm2ddl.auto", "update");

		// Sql Scheme'nin guncellenebilirligini tanimliyoruz. Varsayilan degeri None oldugu icin entity'lerdeki
		// degisiklikler veritabanina yansimiyor.

		app.setDefaultProperties(properties);
		
		// SprinBoot ayaga kaldiriliyor.
		app.run(args);

	}
}
