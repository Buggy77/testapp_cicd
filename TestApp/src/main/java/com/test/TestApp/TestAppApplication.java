package com.test.TestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer forwardToIndex() {
		  return new WebMvcConfigurer() {
		    @Override
		    public void addViewControllers(ViewControllerRegistry registry){
		      registry.addViewController("/").setViewName(
		          "forward:/index.html");
		    }
		  };
	}

}