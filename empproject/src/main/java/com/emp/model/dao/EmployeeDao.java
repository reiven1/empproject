package com.emp.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.emp.common.JDBCTemplate;
import com.emp.model.dto.Employee;

public class EmployeeDao {
	public List<Employee> selectEmpByAll(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM employee";
		List<Employee> employee = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				employee.add(getEmployee(rs));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return employee;
	}

	private Employee getEmployee(ResultSet rs) throws SQLException{
		// TODO Auto-generated method stub
		return Employee.builder()
				.emp_id(rs.getInt("emp_id"))
				.emp_name(rs.getString("emp_name"))
				.emp_no(rs.getString("emp_no"))
				.email(rs.getString("email"))
				.phone(rs.getString("phone"))
				.dept_code(rs.getString("dept_code"))
				.job_code(rs.getString("job_code"))
				.salary(rs.getInt("salary"))
				.sal_level(rs.getString("sal_level"))
				.bonus(rs.getDouble("bonus"))
				.manager_id(rs.getString("manager_id"))
				.ent_date(rs.getDate("ent_date"))
				.ent_YN(rs.getString("ent_YN"))
				.build();
	}

	public List<Employee> selectEmpByName(String name, Connection conn) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM employee WHERE emp_name = ?";
		List<Employee> employee = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				employee.add(getEmployee(rs));
			}
			System.out.println(employee);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return employee;
	}
}
