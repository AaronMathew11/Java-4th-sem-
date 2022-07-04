import java.util.*;  
public class activity1b_1  
{  
public static void main(String args[])   
{
Scanner obj= new Scanner(System.in);  
System.out.println("Enter the number of strings");
int n= obj.nextInt();
String words[] = new String[n]; 
for(int i=0;i<n;i++)
words[i]=obj.next();   
for(int i = 0; i<n-1; i++)   
{  
for (int j = i+1; j<n; j++)   
{  
 
if(words[i].toLowerCase().compareTo(words[j].toLowerCase())>0)   
{   
String temp = words[i];  
words[i] = words[j];  
words[j] = temp;  
}  
}  
}   
System.out.println(Arrays.toString(words));  
}  
}  