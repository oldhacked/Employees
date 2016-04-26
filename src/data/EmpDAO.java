package data;

import java.sql.PreparedStatement;
import java.util.ArrayList;

public interface EmpDAO {
	public ArrayList <ArrayList<Employee>> showAll();
	public ArrayList<String> getHeaders();
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public ArrayList<ArrayList> findEmpByLastName(String lastName);
	public Employee getEmployeeById(String id);
	public void deleteEmployee(String id);
//	public String getLastName(PreparedStatement pst, String lastName);
	
	
}