package com.perfview.techservice.ds.hashtable;

public class EmployeeHashTable {

	private Employee employeelist[] = new Employee[10];

	private int hashKey(Employee employee) {
		return employee.getId();
	}

	public void put(Employee employee) {
		int hashKey = this.hashKey(employee);
		employeelist[hashKey] = employee;

	}

	public Employee get(Employee employee) {
		return employeelist[this.hashKey(employee)];
	}
}
