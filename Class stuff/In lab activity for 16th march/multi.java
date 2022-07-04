import java.util.*;
import java.lang.*;

class parent_class{

void even(int n){
System.out.println("The even numbers in the given range are :");

for(int i=1;i<=n;i++)
{
if(i%2==0)
	System.out.println(i);
}
}



void odd(int n){
System.out.println("The odd numbers in the given range are :");
for(int i=1;i<=n;i++)
{
if(i%2==1)
	System.out.println(i);
}
}
 
}

class multi extends Thread{

static int n;

void armstrong(int n){
System.out.println("The Armstrong numbers in the given range are :");

for(int j=1;j<=n;j++){
int cpy=j, sum=0, rem;
while(cpy>0)
{
rem=cpy%10;
sum+=rem*rem*rem;
cpy/=10;
}
if(sum==j)
	System.out.println(j);
}

}

public void run(){
if(Thread.currentThread().getName()=="Odd")
{
parent_class p = new parent_class();
p.odd(n);
}

else if(Thread.currentThread().getName()=="Even")
{
parent_class p = new parent_class();
p.even(n);
}

else if(Thread.currentThread().getName()=="Armstrong")
{
armstrong(n);
}

}

public static void main( String[] args)
{
Scanner obj= new Scanner(System.in);
n=obj.nextInt();
multi t1= new multi();
multi t2= new multi();
multi t3= new multi();
t1.setName("Even");
t2.setName("Odd");
t3.setName("Armstrong");
t1.start();
t2.start();
t3.start();
}

}
