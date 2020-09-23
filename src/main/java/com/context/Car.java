package com.context;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {

	@Override
	public void start() {

		System.out.println("Ligando o carro");
	}

	@Override
	public void stop() {
		System.out.println("Parando o carro");
	}

}
