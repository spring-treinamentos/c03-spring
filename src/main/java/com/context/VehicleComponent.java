package com.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 
 * @author edson.h.cavalcanti
 * - O Qualifier tem como objetivo qualificar o meu objeto quando tenho mais de uma implementação de uma interface, eu decido qual quero utilizar.
 * 
 */
@Component
public class VehicleComponent {

	@Autowired
	@Qualifier("carBean")
	private Vehicle vehicle;
	
	public void service() {
		vehicle.start();
		vehicle.stop();
	}
}
