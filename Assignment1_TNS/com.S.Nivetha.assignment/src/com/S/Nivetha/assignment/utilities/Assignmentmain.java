package com.S.Nivetha.assignment.utilities;

import com.S.Nivetha.assignment.employees.*;


public class Assignmentmain {

	public static void main(String[] args) {
		
		
		//create instance for developer
		developer d1=new developer();
		developer d2=new developer();
		
		
		d1.setDepartment("Frontend");
		d1.setLanguage("Java");
		
		d2.setDepartment("backend");
		d2.setLanguage("Javascript");
		
		//create instance for manager
		
		manager m1 = new manager();
		manager m2 = new manager();
		
		m1.setExperience(7+"years");
		m1.setCoordination("manage perfect coordination");
		
		m2.setExperience(4+"years");
		m2.setCoordination("perfect team coordination");
		
		System.out.println("developer dept:"+d1.getDepartment()+"  |  Skill:"+d1.getLanguage());
		System.out.println("developer dept:"+d2.getDepartment()+"  |  Skill:"+d2.getLanguage());
		System.out.println("manager experience:"+m1.getExperience()+"  |  team management:"+m1.getCoordination());
		System.out.println("department:"+m2.getExperience()+"  |  team management:"+m2.getCoordination());

		


	


	}

}
