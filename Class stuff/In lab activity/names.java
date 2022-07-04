import java.util.Scanner;
class names{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter the value of n :");
int size= obj.nextInt();
String first_name[]=new String[size];
String last_name[]= new String[size];
for(int i=0;i<size;i++)
	first_name[i]= obj.next();
for(int i=0;i<size;i++)
	last_name[i]= obj.next();
String full_name[]=new String[size];
for(int i=0;i<size;i++)
	full_name[i]= first_name[i]+last_name[i];
for(String s:full_name)
System.out.print(s+ " ");
}
}