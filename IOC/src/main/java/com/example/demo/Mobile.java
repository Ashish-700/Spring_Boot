package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext AC = new ClassPathXmlApplicationContext("beans.xml");
        
        // Get the bean
        Sim sim = AC.getBean("sim", Sim.class);
         
        // Calling the methods
        sim.Calling();
        sim.data();

		

	}

}
