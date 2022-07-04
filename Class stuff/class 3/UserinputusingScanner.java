import java.util.Scanner; //you only import the Scanner class
//import java.util.*; //-->import all the classes from the util package

class User_input_Scanner
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
String s=obj.next();
//String line1=obj.nextLine();

int x=obj.nextInt();
float y=obj.nextFloat();
String line=obj.nextLine(); //-->read the input till \n
System.out.println(s);
System.out.println(x);
System.out.println(y);
System.out.println(line);
}
}