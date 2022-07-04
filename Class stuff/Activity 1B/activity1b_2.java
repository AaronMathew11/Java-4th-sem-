import java.util.*;
public class activity1b_2
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
System.out.println("Enter the number of strings");
int n= obj.nextInt();
String words[] = new String[n];
for(int i=0;i<n;i++)
words[i]= obj.next();
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
int l= ( words[j].length()<words[i].length() )? words[j].length():words[i].length();
for(int k=0;k<l;k++)
{
int b= words[j].charAt(k);
int a= words[i].charAt(k);

if (a>= 'A' && a<= 'Z') 
  a = a + 32;
if (b >= 'A' && b<= 'Z') 
  b = b + 32;

if(b>a)
{
String temp= words[i];
words[i]= words[j];
words[j]=temp;
break;
}
else break;
}}}
for(int i=0;i<n;i++)
System.out.print(words[i]+ " ");
}
}