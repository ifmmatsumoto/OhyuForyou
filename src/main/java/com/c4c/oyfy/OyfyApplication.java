package com.c4c.oyfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.oyfy.dbflute.allcommon.DBFluteBeansJavaConfig;

@SpringBootApplication
@Import(DBFluteBeansJavaConfig.class)
public class OyfyApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OyfyApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(OyfyApplication.class, args);
	}

}
