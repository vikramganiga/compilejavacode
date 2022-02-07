package com.perfview.techservice.ds.queue;

public class DemoQueue {
	
	public static void main(String args[]) {
	
		Queue queue = new Queue();
		
		//Add first employee
		Employee employee = new Employee();
		employee.setName("First");
		queue.add(employee);
		
		employee = new Employee();
		employee.setName("Second");
		queue.add(employee);
		
		employee = new Employee();
		employee.setName("Third");
		queue.add(employee);
		
		System.out.println(" "+queue.remove().getName());
		System.out.println(" "+queue.remove().getName());
		System.out.println(" "+queue.remove().getName());
	}

}
