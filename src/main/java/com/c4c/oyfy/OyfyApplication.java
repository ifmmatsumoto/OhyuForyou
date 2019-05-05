package com.c4c.oyfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.oyfy.dbflute.allcommon.DBFluteBeansJavaConfig;

@SpringBootApplication
@Import(DBFluteBeansJavaConfig.class)
public class OyfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OyfyApplication.class, args);
	}

}
