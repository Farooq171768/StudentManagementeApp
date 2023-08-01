package cgg.sma.model;

public class Student {
		private int student;
		private String name;
		private String phone;
		private String city;
		public Student(int student, String name, String phone, String city) {
			super();
			this.student = student;
			this.name = name;
			this.phone = phone;
			this.city = city;
		}
		public Student(String name, String phone, String city) {
			super();
			this.name = name;
			this.phone = phone;
			this.city = city;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getStudent() {
			return student;
		}
		public void setStudent(int student) {
			this.student = student;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Student [student=" + student + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
		}
		
		
	
		
}
