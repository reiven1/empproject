package com.emp.model.service;

import java.sql.Connection;
import java.util.List;

import com.emp.common.JDBCTemplate;
import com.emp.model.dao.EmployeeDao;
import com.emp.model.dto.Employee;

public class EmpService {
	private EmployeeDao dao = new EmployeeDao();
	public List<Employee> selectEmpAll(){
		Connection conn = JDBCTemplate.getConnection();
		List<Employee> employee = dao.selectEmpByAll(conn);
		JDBCTemplate.close(conn);
		return employee;
	}
	public List<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		Connection conn = JDBCTemplate.getConnection();
		List<Employee> employee = dao.selectEmpByName(name, conn);
		JDBCTemplate.close(conn);
		return employee;
	}
}
