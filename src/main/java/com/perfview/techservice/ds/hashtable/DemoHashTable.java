package com.perfview.techservice.ds.hashtable;

public class DemoHashTable {

	public static void main(String args[]) {
		EmployeeHashTable employeeHashTable = new EmployeeHashTable();

		Employee employee1 = new Employee("Raju", 1);
		employeeHashTable.put(employee1);

		Employee employee2 = new Employee("Raju", 2);
		employeeHashTable.put(employee2);

		Employee employee3 = new Employee("Raju", 3);
		employeeHashTable.put(employee3);
		
		Employee employee = employeeHashTable.get(employee1);
		System.out.println(" Employee ID "+employee.getId());
		
		employee = employeeHashTable.get(employee2);
		System.out.println(" Employee ID "+employee.getId());

		employee = employeeHashTable.get(employee3);
		System.out.println(" Employee ID "+employee.getId());


	}

}
