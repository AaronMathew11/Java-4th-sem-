class Mutlithreading extends Thread
{
Mutlithreading()
{
}
Mutlithreading(String s)
{
super(s);
}
public void run()
{
for(int i=0;i<5;i++)
{
//System.out.println("Multithreading is the lightweight "+this.getName());
System.out.println("Multithreading is the lightweight "+Thread.currentThread().getName());
System.out.println("Thread Id is "+Thread.currentThread().getId());
}
}
public static void main(String args[])
{
Mutlithreading T1=new Mutlithreading();
Mutlithreading T2=new Mutlithreading("B2 Thread");
T1.setName("B1 Thread");
//T2.setName("B2 Thread");
T1.start(); //will invoke run()
//T1.start(); //java.lang.IllegalThreadStateException, you can't start the thread more than once
T2.start();
//T1.run(); //this will consider as normal member function, serial execution
//T2.run();
System.out.println("Thread(inside the main method) Id is "+Thread.currentThread().getId());
System.out.println("default thread name(inside the main method) is "+Thread.currentThread().getName());
}
}