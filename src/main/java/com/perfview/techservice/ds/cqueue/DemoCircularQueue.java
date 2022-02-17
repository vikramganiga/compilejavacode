package com.perfview.techservice.ds.cqueue;

/**
 * Not working solution
 * 
 * @author vshetty
 *
 */
public class DemoCircularQueue {

	public static void main(String args[]) {

		CircularQueue circularQueue = new CircularQueue();
		Employee employee = new Employee();
		employee.setName("1");
		circularQueue.add(employee);
		
		employee = new Employee();
		employee.setName("2");
		circularQueue.add(employee);
		
		employee = new Employee();
		employee.setName("3");
		circularQueue.add(employee);
		

		circularQueue.print();
		
		employee = new Employee();
		employee.setName("4");
		circularQueue.add(employee);
		
		employee = new Employee();
		employee.setName("5");
		circularQueue.add(employee);
				
		employee = new Employee();
		employee.setName("6");
		circularQueue.add(employee);
		

		circularQueue.print();
		
		employee = new Employee();
		employee.setName("7");
		circularQueue.add(employee);
				
		employee = new Employee();
		employee.setName("8");
		circularQueue.add(employee);
		
		circularQueue.remove();	
		circularQueue.print();
		
		circularQueue.remove();	
		circularQueue.print();

		circularQueue.remove();	
		circularQueue.print();

		circularQueue.remove();	
		circularQueue.print();
	

		circularQueue.remove();	
		circularQueue.print();
	

		employee = new Employee();
		employee.setName("9");
		circularQueue.add(employee);
		circularQueue.print();
		

		employee = new Employee();
		employee.setName("eight");
		circularQueue.add(employee);
		circularQueue.print();
		
		
		
	}

}
