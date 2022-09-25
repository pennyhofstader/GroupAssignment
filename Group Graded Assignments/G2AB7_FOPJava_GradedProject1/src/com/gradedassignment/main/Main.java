

package com.gradedassignment.main;
import com.gradedassignment.admin.*;
import com.gradedassignment.hr.*;
import com.gradedassignment.tech.TechDepartment;

public class Main {
	public static void main(String[] args) {

		AdminDepartment AdminDepartment =  new AdminDepartment();
		HrDepartment HrDepartment = new HrDepartment();
		TechDepartment TechDepartment = new TechDepartment();
		
		System.out.println(AdminDepartment.departmentName());
		System.out.println(AdminDepartment.getTodaysWork());
		System.out.println(AdminDepartment.getWorkDeadline());
		System.out.println(AdminDepartment.isTodayAHoliday() + "\n");
		
		System.out.println(HrDepartment.departmentName());
		System.out.println(HrDepartment.doActivity());
		System.out.println(HrDepartment.getTodaysWork());
		System.out.println(HrDepartment.getWorkDeadline());
		System.out.println(HrDepartment.isTodayAHoliday() + "\n");
		
		System.out.println(TechDepartment.departmentName());
		System.out.println(TechDepartment.getTodaysWork());
		System.out.println(TechDepartment.getWorkDeadline());
		System.out.println(TechDepartment.getTechStackInformation());
		System.out.println(TechDepartment.isTodayAHoliday() + "\n");
		
		
		


	}

}
