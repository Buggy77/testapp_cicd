package com.test.TestApp;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TestAppApplication {

	public static void main(String[] args) {
		Integer valor = new TestAppApplication().metodoTest();
		System.out.print(valor);
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
	
	public Integer metodoTest() {
		
		Integer valor = 0;
		
		if (valor.compareTo(0) == 0) {
			valor = 1 + 1;
		} else if (valor.compareTo(1) > 0) {
			valor = 1 +2;
		} 
		return valor;
	}

}
