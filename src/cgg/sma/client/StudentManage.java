package cgg.sma.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cgg.sma.dao.StudentDAO;

public class StudentManage {
	StudentDAO studentDAO = new StudentDAO();

	public static void main(String[] args) {
		System.out.println("welcome to student management appliction");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to update student");
			System.out.println("Press 3 to delete student");
			System.out.println("Press 4 to display all students");
			System.out.println("Press 5 to exit");
			
			System.out.println("enter your choice");
			
			try {
			int ch=Integer.parseInt(br.readLine());
			if(ch==1) {
				//add students
				System.out.println("Enter student name");
				String name=br.readLine();
				System.out.println("Enter student phone number");
				String phone= br.readLine();
				System.out.println("Enter student city");
				String city =br.readLine();
				
				//create student object to store
				Student student = new Student (name,phone,city);
				boolean answer = studentDAO.insertStudentToDB(student);
				if(answer) {
					System.out.println("Student added successfully");
				}
				else {
					System.out.println("Something went wrong");
				}
				
			}
			else if(ch==2) {
				//update students
			}
			else if(ch==3) {
				//delete students
				
				System.out.println("Enter student id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean answer = studentDAO.deleteStudent(userId);
				if(answer) {
					System.out.println("DELETED");
				}
				else {
					System.out.println("Something went wrong");
				}
			}
			else if(ch==4) {
				//display all students
				
				studentDAO.showAllStudents();
			}
			else {
				//exit
			}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thank you for using this app");
		System.out.println("See you seen......");
	}

}

