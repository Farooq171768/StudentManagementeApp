package cgg.sma.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cgg.sma.manage.ConnectionProvider;
import cgg.sma.model.Student;

public class StudentDAO {
	
	Connection conn;

	public StudentDAO() {
		super();
		conn = ConnectionProvider.createConnection();
	}
	
	public boolean insertStudentToDB(Student st) {
		boolean f= false;
		
		try {
			String q= "insert into student (student_name,student_phone,student_city) values (?,?,?)";
			//preparedStatement....
			conn.preparedStatement(q);
			
			//set the value of parameters
			
			ps.setString(1,st.getsName());
			ps.setString(2,st.getsPhone());
			ps.setString(3,st.getsCity());
			
			
			//executing the update
			ps.executeUpdate();
			f=true;
			
			
		}
		catch(SQLException e) {
			e.printStackTrace;
		}
		return f;
	}
	
	public boolean deleteStudent(int userId) {
		boolean f= false;
		
		try {
			String q= "delete fro, student where studentid=?";
			
			PreparedStatement ps = conn.prepareStatement(q);
			
			ps.setInt(1,userId);
		}
		catch(SQLException e) {
			e.printStackTrace;
		}
	}
	return f;
	
	public void showAllStudents() {
		try {
			String q="select * from students";
			
			//create statement
			Statement stm= conn.createStatement();
			ResultSet rs= stm.executeQuery();
			whilr(rs.next()){
				int id=rs.getInt(1);
				String name= rs.getString(2);
				String phone= rs.getString(3);
				String city= rs.getString(4);
				
				System.out.println("Id: " +id);
				System.out.println("Name: " +name);
				System.out.println("Phone: " +phone);
				System.out.println("City: " +city);
			}
			rs.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace;
		}
	}
}
