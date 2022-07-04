import java.util.*;
import java.lang.*;

class Person {
long phone_no;
String name,address;

void get_person_details(String sname,String saddress, long spno)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter name:");
name=obj.nextLine();
System.out.println("Enter address :");
address=obj.nextLine();
System.out.println("Enter phone number:");
phone_no=obj.nextLong();
obj.close();
}

void show_person_details()
{
System.out.println("Name: "+name);
System.out.println("Address: "+address);
System.out.println("Phone Number: :"+phone_no);
}
}

class Faculty {
String faculty_code, faculty_name, faculty_designation;

void get_faculty_details()
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter faculty code:");
faculty_code=obj.next();
System.out.println("Enter faculty name:");
faculty_name=obj.nextLine();
System.out.println("Enter faculty designation:");
faculty_designation=obj.next();
obj.close();
}

void show_faculty_details()
{
System.out.println("Faculty code: "+faculty_code);
System.out.println("Faculty name: "+faculty_name);
System.out.println("Faculty designation: "+faculty_designation);
}
}

class student{
String student_name, Reg_no, student_address, email, faculty_name,code,title,slot;
long student_phonenumber;

void get_student_details(String sname, String reg, String semail, String saddress,long spno)
{
Scanner obj= new Scanner(System.in);
Reg_no=reg;
student_name=sname;
student_address=saddress;
email=semail;
student_phonenumber=spno;

System.out.println("Enter the Course details");
for(int i=0;i<5;i++)
{
System.out.println("Enter the Course code");
code=obj.next();
System.out.println("Enter the Course title");
title=obj.next();
System.out.println("Enter the Course slot");
slot=obj.next();
System.out.println("Enter the Faculty name");
faculty_name=obj.next();

}


}

void show_student_details()
{
System.out.println("Student name: "+student_name);
System.out.println("Student Reg. no: "+Reg_no);
System.out.println("Student address: "+student_address);
System.out.println("Student email: "+email);
System.out.println("Student Phone number: "+student_phonenumber);
}

public static void main(String args[])
{
String reg, sname, semail,saddress;
long spno;
Scanner obj = new Scanner(System.in);
Person person_array[]= new Person[5];
student student_array[]= new student[5];
for(int i=0;i<5;i++)
{
student_array[i]=new student(); 
person_array[i]=new Person();
System.out.println("Enter "+(i+1)+" Students name:");
sname=obj.nextLine();
System.out.println("Enter "+(i+1)+" Students Reg. no:");
reg=obj.next();
System.out.println("Enter "+(i+1)+" Students Address:");
saddress=obj.nextLine();
System.out.println("Enter "+(i+1)+" Students Email:");
semail=obj.next();
System.out.println("Enter "+(i+1)+" Students phone number:");
spno=obj.nextLong();
student_array[i].get_student_details(sname,reg,semail,saddress,spno);
person_array[i].get_person_details(sname,saddress,spno);
student_array[i].show_student_details();
}
}
}