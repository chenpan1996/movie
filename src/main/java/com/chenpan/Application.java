package com.chenpan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication// same as @Configuration @EnableAutoConfiguration  @ComponentScan	
public class Application extends SpringBootServletInitializer{

	/**
	 * SpringApplication类提供了一种从main()方法启动Spring应用的便捷方式。 在很多情况下， 你只需委托给
	 * SpringApplication.run这个静态方法：
	 * 
	 * @param args
	 */

	public static void  main(String[] args) {
        		
		SpringApplication.run(Application.class, args);
			
	}	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
