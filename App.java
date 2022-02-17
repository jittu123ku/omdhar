package com.springcore.firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static <ApplicationContext> void main( String[] args )
    {

//    	Vehicle v=new Bike();
//    	v.drive();
   	AbstractXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	
//    	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com\\springcore\\firstspring\\spring.xml");

    	
//    	Vehicle obj=(Vehicle)((BeanFactory) context).getBean("bike");
//    	obj.drive();
   	
   	
//    	Tyre t=(Tyre) context.getBean("tyre");
//    	
//    	System.out.println(t);
   	
   	    Car t=(Car) context.getBean("car");
   	    t.drive();
    	
    }
}
