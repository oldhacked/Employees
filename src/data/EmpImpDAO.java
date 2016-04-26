package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpImpDAO implements EmpDAO {

	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/companydb";
	private static ArrayList<String> headerList = new ArrayList<>();
	Connection conn;

	public EmpImpDAO() {
		try {
			Class.forName(DRIVER_CLASS_NAME);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(URL, "student", "student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	


	public void deleteEmployee(String id) {

		System.out.println("in delete method");
		System.out.println(id);
		String stmt = "delete from employees where id =" + id;

		try {
			
			System.out.println("in delete method try block");
			System.out.println(id);
			Statement statement = conn.createStatement();
			statement.executeUpdate(stmt);
			
		


		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	
//
//	public ArrayList<ArrayList> findEmpByLastName(String id) {
//
//		System.out.println(lastName);
//		ArrayList<ArrayList> arrList2d = new ArrayList<>();
//		PreparedStatement pst;
//
//		try {
//			String qry = "insert into employees where id =" + "'" + id + "'";
//			
//
//			Statement statement = conn.createStatement();
//			ResultSet rs = statement.executeQuery(qry);
//			
//			headerList.clear();
//
//			for (int i = 1; i <= md.getColumnCount(); i++) {
//				headerList.add(md.getColumnName(i));
//
//			}
//
//			while (rs.next()) {
//				ArrayList<String> row = new ArrayList<>();
//				for (int i = 1; i <= md.getColumnCount(); i++) {
//					row.add(rs.getString(i));
//				}
//				arrList2d.add(row);
//				System.out.println(row);
//			}
//
//			rs.close();
//			statement.close();
//			conn.close();
//
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//		return arrList2d;
//	}
//	
	
	
	
	
	public void addEmployee(Employee emp) {

		PreparedStatement pst;

		String stmt = "insert into employees(firstname, lastname, department_id, job_id) values(?,?,?,?)";

		try {
			pst = conn.prepareStatement(stmt);
			pst.setString(1, emp.getFirstname());
//			pst.setString(2, emp.getMiddlename());
			pst.setString(2, emp.getLastname());
			// pst.setInt(4, emp.getDepartment_id());
			// pst.setInt(5, emp.getJob_id());
			pst.setInt(3, 6);
			pst.setInt(4, 6);
			System.out.println(pst);
			int uc = pst.executeUpdate();

			System.out.println(uc + " row(s) updated.");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void updateEmployee(Employee emp) {

System.out.println("in dao" + emp);
		PreparedStatement pst;

		String stmt = "update employees set firstname=?, lastname=?, department_id=?, job_id=? where id=?";
//		String stmt = "update employees set ( firstname, lastname, department_id, job_id) values(?,?,?,?) where id=?";

		try {
			pst = conn.prepareStatement(stmt);
			pst.setString(1, emp.getFirstname());
			pst.setString(2, emp.getLastname());
//			pst.setString(3, emp.getLastname());
//			pst.setString(4, emp.getEmail());
//			pst.setString(5, emp.getHiredate());
//			int i = emp.getSalary();
//			pst.setInt(6, i);
			pst.setInt(3, 1);
			pst.setInt(4, 1);
			pst.setInt(5, emp.getId());
			System.out.println(pst);
			int uc = pst.executeUpdate();

			System.out.println(uc + " row(s) updated.");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
//		firstname
//		lastname
//		gender
//		email
//		hiredate
//		salary
//		department_id
//		job_id
		
		
		
		
		
		
		
		
	}
	
	

	public ArrayList<ArrayList> findEmpByLastName(String lastName) {

		System.out.println(lastName);
		ArrayList<ArrayList> arrList2d = new ArrayList<>();
		PreparedStatement pst;

		try {
			String qry = "SELECT * FROM employees WHERE lastname=" + "'" + lastName + "'";
			

			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			ResultSetMetaData md = rs.getMetaData();

			headerList.clear();

			for (int i = 1; i <= md.getColumnCount(); i++) {
				headerList.add(md.getColumnName(i));

			}

			while (rs.next()) {
				ArrayList<String> row = new ArrayList<>();
				for (int i = 1; i <= md.getColumnCount(); i++) {
					row.add(rs.getString(i));
				}
				arrList2d.add(row);
				System.out.println(row);
			}

			rs.close();
			statement.close();
			conn.close();

		} catch (Exception e) {
			System.err.println(e);
		}
		return arrList2d;
	}

	
	
	public ArrayList<ArrayList<Employee>> showAll() {

		ArrayList<String> row = new ArrayList<>();
		ArrayList<ArrayList> arrList2d = new ArrayList<>();
		ArrayList<Employee> empObject = new ArrayList<>();
		ArrayList<ArrayList<Employee>> empList = new ArrayList<>();
		

		try {
			String qry = "select * from employees";
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			ResultSetMetaData md = rs.getMetaData();

			headerList.clear();

			for (int i = 1; i <= md.getColumnCount(); i++) {
				headerList.add(md.getColumnName(i));

			}

			while (rs.next()) {
				
				System.out.println(rs.getString(1));
				
//				for (int i = 1; i <= md.getColumnCount(); i++) {
					
				
					empObject.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(16),rs.getInt(17)));				


			}
		
			empList.add(empObject);

			rs.close();
			statement.close();
			

		} catch (Exception e) {
			System.err.println(e);
		}
		return empList;
	}
	
	public Employee getEmployeeById(String id) {
		
		Employee emp = new Employee();
		try {
			String qry = "select * from employees where id = " + id;
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(qry);
			ResultSetMetaData md = rs.getMetaData();			
			
			while (rs.next()) {
				
			emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),rs.getInt(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getInt(16),rs.getInt(17));
			
			}
			rs.close();
			statement.close();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		return emp;
	}
	
	
	
	public ArrayList<String> getHeaders() {

		return headerList;

	}

	

	
}
	
	
