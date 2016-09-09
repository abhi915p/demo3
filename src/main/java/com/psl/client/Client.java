package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.entity.Employee;
import com.psl.service.EmployeeService;

class Client {
	
	private static EmployeeService service;
	

	public static EmployeeService getService() {
		return service;
	}


	public  void setService(EmployeeService service) {
		this.service = service;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		//spring container initialization		
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		
		
		
		
		//get beans
		Employee e = (Employee)context.getBean("emp");

		//invoking business logic
		//System.out.println(e.toString());
		
		System.out.println("In client and employee flow");
	    service.addEmployee(e);	
		System.out.println("Done adding Employee");
	
	}

	
}
