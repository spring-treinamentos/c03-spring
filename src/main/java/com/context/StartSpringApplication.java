package com.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 
 * @author edson.h.cavalcanti
 *
 * ApplicationContext consigo manipular tudo que está no contexto do spring.
 * No exemplo abaixo consegui aplicar um método de um controller dentro do contexto do spring.
 * 
 */

@SpringBootApplication
public class StartSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(StartSpringApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
		
		VehicleComponent component = (VehicleComponent) ctx.getBean("vehicleComponent");
		component.service();
		
		
	}

}
