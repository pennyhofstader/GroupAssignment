package com.gradedassignment.admin;

import com.gradedassignment.main.*;

public class AdminDepartment extends SuperDepartment{
	
	
	
	
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete By EOD";
	}
}
