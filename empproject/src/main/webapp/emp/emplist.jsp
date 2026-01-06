<%@page import="jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput"%>
<%@ page import="com.emp.model.dto.Employee"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
List<Employee> employee = (List)request.getAttribute("employee");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>사원 조회 결과</h3>
	<table>
		<tr>
			<th>사원아이디</th>
			<th>사원명</th>
			<th>사원번호</th>			
			<th>이메일</th>			
			<th>전화번호</th>			
			<th>부서코드</th>			
			<th>작업코드</th>			
			<th>급여</th>			
			<th>직급</th>			
			<th>보너스</th>			
			<th>매니저아이디</th>			
			<th>퇴사일</th>			
			<th>퇴사여부</th>			
		</tr>
		<tbody>
			<%
			for(Employee e : employee){ 
			%>
				<tr>
					<td><%=e.getEmp_id() %></td>
					<td><%=e.getEmp_name() %></td>
					<td><%=e.getEmp_no() %></td>			
					<td><%=e.getEmail() %></td>			
					<td><%=e.getPhone() %></td>			
					<td><%=e.getDept_code() %></td>			
					<td><%=e.getJob_code() %></td>			
					<td><%=e.getSalary() %></td>			
					<td><%=e.getSal_level() %></td>			
					<td><%=e.getBonus() %></td>			
					<td><%=e.getManager_id() %></td>			
					<td><%=e.getEnt_date() %></td>			
					<td><%=e.getEnt_YN() %></td>		
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>