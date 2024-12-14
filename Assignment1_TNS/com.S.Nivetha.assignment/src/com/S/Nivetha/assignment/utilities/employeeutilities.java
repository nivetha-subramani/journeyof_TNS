package com.S.Nivetha.assignment.utilities;

import com.S.Nivetha.assignment.employees.*;
public class employeeutilities {
	public static void main(String[] args){
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		
		
		e1.setName("Nivetha");
		e1.setEmployeeId(4082);
		e1.setSalary(45000);
		
		e2.setName("sangeetha");
		e2.setEmployeeId(4056);
		e2.setSalary(46000);
		
		e3.setName("kaviya");
		e3.setEmployeeId(40118);
		e3.setSalary(41000);
		
		
		System.out.println("employee name:"+e1.getName()+"  |  employee id:"+e1.getEmployeeId()+"   |employee salary"+e1.getSalary());
		System.out.println("employee name:"+e2.getName()+"  |  employee id:"+e2.getEmployeeId()+"   |employee salary"+e2.getSalary());
		System.out.println("employee name:"+e3.getName()+"  |  employee id:"+e3.getEmployeeId()+"   |employee salary"+e3.getSalary());
		
		
		
		
		
	
		
		
	}

}
