package com.ibicd.springbootdemo;

import com.ibicd.springbootdemo.config.JulieImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(JulieImportSelector.class)
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootDemoApplication.class, args);
//		System.out.println(applicationContext.getBean(User.class).getName());

		System.out.println("当前类加载器是： "+Thread.currentThread().getContextClassLoader());
	}

}
