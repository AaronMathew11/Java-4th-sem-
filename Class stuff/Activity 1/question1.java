class question1
{
public static void main(String args[])
{
int n,temp,min;
n=Integer.parseInt(args[0]);
int a[]= new int[n];
for(int i=0;i<n;i++)
a[i]=Integer.parseInt(args[i+1]);
for(int i=0;i<n-1;i++)
{
min=i;
for(int j=i+1;j<n;j++)
{
if(a[j]<a[max])
min=j;
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
System.out.println("the sorted array is :");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}}