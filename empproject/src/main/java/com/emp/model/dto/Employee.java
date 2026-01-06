package com.emp.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_no;
	private String email;
	private String phone;
	private String dept_code;
	private String job_code;
	private String sal_level;	
	private int salary;
	private double bonus;
	private String manager_id;
	private Date ent_date;
	private String ent_YN;
}
