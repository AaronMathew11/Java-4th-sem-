import java.util.Scanner;
class question {
public static void main(String args[])
{
String name,gender,tongue;
Integer age;
Scanner obj= new Scanner(System.in);
System.out.println("Enter your name");
name=obj.nextLine();
System.out.println("Enter your age");
age=obj.nextInt();
System.out.println("Enter your gender");
gender=obj.nextLine();
System.out.println("Enter your Mother tongue");
tongue=obj.nextLine();
System.out.println("Name :"+ name);
System.out.println("Age :"+ age);
System.out.println("Gender :"+ gender);
System.out.println("Mother tongue :"+ tongue);

}
}