import java.util.Scanner;
class question2
{
public static void main(String args[])
{
int n,temp,max;
Scanner obj= new Scanner(System.in);
System.out.println("Enter the number of elements");
n=obj.nextInt();
int a[]= new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
a[i]=obj.nextInt();
for(int i=0;i<n-1;i++)
{
max=i;
for(int j=i+1;j<n;j++)
{
if(a[j]>a[max])
max=j;
}
temp=a[i];
a[i]=a[max];
a[max]=temp;
}
System.out.println("the sorted array is :");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}}
