/**
 * Copyright (c) 2016-2019 雅南集团 All rights reserved.
 *
 * https://www.yanan.io
 *
 * 版权所有，侵权必究！
 */

package io.renren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class AdminApplication extends SpringBootServletInitializer {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AdminApplication.class);
	}*/

	
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
	
	

}
