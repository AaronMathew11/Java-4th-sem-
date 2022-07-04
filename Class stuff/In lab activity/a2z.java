import java.until.*;
import java.io.*;

public class House{
 private String h_address;
 private String h_name;
 private int house_no;
 private float r_amt;
 
 public House(String address, String name, int number, float amt){
 h_address = address;
 h_name = name;
 house _no = number;
 r_amt = amt;
 }

 public String getAddress(){
 return h_address;
 }

 public String getName(){
 return h_name;
 }

 public int getNumber(){
 return house_no;
 }
 public float getAmount(){
 return r_amt;
 }
 
 public void setAdress(String address){
 h_address = address;
 }  

 public void setName(String name){
 h_name = name;
 }

 public void setNumber(int number){
 house_no = number;
 }

 public void setAmount(float amt){
 r_amt = amt;  
 }
 
 public String toString(){
 return "adress: " + h_address + ", name:"+ h_name + ", Number: " + house_no + ", Amount: " + r_amt;
 }
}

class Owner extends House
{
 private String o_name;
 private String o_address;
 private String o_email;
 public Owner(String address, String name, int number, float amt, String owner_name, String owner_address, String email)
 {
  super(address, name, number, amt); //super class constructor
  o_name = owner_name;
  o_address = owner_address;
  o_email = email;
 }
 public String getOwnername(){
 return o_name;
 }

 public String getOwneradress(){
 return o_address;
 }

 public String getEmail(){
 return o_email;
 }

 public void setOwnername(String owner_name){
 o_name = owner_name;
 }

 public void setOwnername(String owner_address){
 o_address = owner_address;
 }

 public void setOwnername(String email){
 o_email = email;
 }


 public String toString(){
 return super.toString() + ", owner name " + o_name + ", owner address " + owner_address + ", owner email " + o_email;
 }  
}

class Tenants extends Owner
{
 private String tenantAddress;
 
 public Owner(String address, String name, int number, float amt, String owner_name, String owner_address, String email, String tenant_address)
 {  
 super(address, name, number, amt, owner_name, owner_address, email);
 this.tenant_address = tenantAddress;
 }
 public String getTenant(){
 return tenantAddress;
 }  
 }
 public void setTenant(String tenant_addressr)
 {
 this.tenant_address = tenantAddress; //tenant's interested location
 }

 if (tenantAddress = h_address) {
   return super.toString() + ", owner name " + o_name + ", owner address " + owner_address + ", owner email " + o_email + "Details of owner based on tenant's choice:";
 }
}

public class Main
{
 public static void main(String[] args) {
 
 House h = new House("Vellore","siana",07, 2500);
 Owner o = new Owner("Aaron", "Vellore" ,"AaronMathew@gmailcom");
 Tenant t=new Tenant("Vellore");

 System.out.println(h);
 System.out.println(o);
 System.out.println(t);

 }