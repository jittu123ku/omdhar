package com.springcore.firstspring;

import org.springframework.stereotype.Component;



@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("bike is running");
	}
}
