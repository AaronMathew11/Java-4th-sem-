import java.util.*;
import java.io.*;

class tupac{
    
}

interface labprep{
void prep1();
void prep2();
}

class falseerror extends Exception{
	public falseerror(String s){
	super(s);
}
}

class files implements labprep {

public void prep1(){

}

public void prep2(){

}

public static void main(String args[]){
try{
File trial1 = new File ("Trial1.txt");
if(trial1.createNewFile())
	System.out.println(trial1.getName() +" has been created");
else System.out.println("File already exists");
FileWriter fw = new FileWriter("trial1.txt");
FileReader fr = new FileReader("trial1.txt");
fw.write("im only one call away and ill be there to save the day supermans got nothing on me im only one call away");
System.out.println("stuff has been writen to the file");
fw.close();
Scanner obj = new Scanner(trial1);
while(obj.hasNext()){
String s= obj.nextLine();
String s1[]= s.split(" ");
for(int i=0;i<s1.length;i++)
if(s1[i].charAt(0)=='a')	
	System.out.println(s1[i]);
System.out.println(s);
}}
catch(Exception e){
System.out.println("IO exception occured");
}
try{ throw new falseerror("error");}
catch(falseerror e){System.out.println("False error has been thrown");}



}}