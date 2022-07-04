import java.util.*;
import java.lang.*;

class person{
	String person_name, person_address, person_phoneno;

	void get_person_details(){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Person's Name: ");
		person_name = obj.next();
		System.out.print("Enter Person's Phone No:  ");
		person_phoneno = obj.next();
		System.out.print("Enter Person's Address: ");
		person_address = obj.next();
	}

	void show_person_details(){
		System.out.println("Person Name: " + person_name);
		System.out.println("Phone Number: " + person_phoneno);
		System.out.println("Address: " + person_address);
	}
}

class faculty{
	String faculty_name, faculty_designation, faculty_code;

	void get_faculty_details(){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Faculty Name: ");
		faculty_name = obj.next();
		System.out.print("Enter Faculty ID:  ");
		faculty_code = obj.next();
		System.out.print("Enter Designation: ");
		faculty_designation = obj.next();
	}

	void show_faculty_details(){
		System.out.println("Faculty Name: " + faculty_name);
		System.out.println("Faculty Code: " + faculty_code);
		System.out.println("Designation: " + faculty_designation);
	}
}

class Student{
	static String address = "VIT, Vellore";
	String name,email,regno,code,title,slot,fac;

	Student(String r, String n, String e){
		regno = r;
		name = n;
		email= e;
	}
	Student(){}
	
	void get_student_details(){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		name = obj.next();
		System.out.print("Enter Student Email:  ");
		email = obj.next();
		System.out.print("Enter Reg no: ");
		regno = obj.next();
	}
	
	void get_course_details(){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Code: ");
		code = obj.next();
		System.out.print("Enter Title:  ");
		title = obj.next();
		System.out.print("Enter Slot: ");
		slot = obj.next();
		System.out.print("Enter Faculty name: ");
		fac = obj.next();
	}

	void show_course_details (){
		System.out.println("Course code: " + code);
		System.out.println("Course title: " + title);
		System.out.println("Slot: " + slot);
		System.out.println("Faculty name: " + fac);
	}

	void show_student_details (){
		System.out.println("Reg No: " + regno);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Email: " + email);
	}
}

class Main {
	public static void main(String[] args) {
		String regno,email,address,name;

		Student student_array[]= new Student[5];
		student_array[0]=new Student("20BCE123","Arjun","Arjun@vit.com");
		student_array[0].show_student_details();

		for(int i=1;i<5;i++)
		{
			student_array[i]=new Student();
			student_array[i].get_student_details();
			student_array[i].show_student_details();
			student_array[i].show_course_details();
			stuent_array[i].get_course_details();
		}

		Scanner obj = new Scanner(System.in);
		faculty faculty_array[]= new faculty[5];
		
		for(int i=0;i<5;i++)
		{
			faculty_array[i]=new faculty();
			faculty_array[i].get_faculty_details();
			faculty_array[i].show_faculty_details();
		}

		person person_array[]= new person[5];

		for(int i=0;i<5;i++)
		{
			person_array[i]=new person();
			person_array[i].get_person_details();
			person_array[i].show_person_details();
		}
	}
}