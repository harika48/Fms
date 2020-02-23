package com.ram.corejava.application1;
public class EmployeeInformation  extends BankAccountDetails  implements Employee_Interface 
{   int empno;
   float sal;
   String address;
	public void employeeInfo(int empno,float sal)// Overriding method  of Employee_Interface
	{ 	this.empno=empno;
		this.sal=sal; 		
	}
    public void employeeAddress(String address) // Overriding method  of Employee_Interface
    {    	this.address=address;
    }
      	public void  employeeDetails() // Overriding method of Employee_Interface
    	{
    		System.out.println("Employee No"+empno);
    	    System.out.println("Employee sal"+sal); 
    	    System.out.println("Employe Address "+address);
    	    System.out.println("Country :"+country);
    	 }
       public void  accountDetails()// BankAccountDetails.java
    	{
    		System.out.println("Account no : 12300456");
    		System.out.println("Area  : Bangalore");
    	}
	 	public void   test()// this class method
    	{
    		System.out.println("Local ..Test");
    	}
	public static void main(String[] args) {
		
		EmployeeInformation emp=new EmployeeInformation();
		   emp.employeeInfo(100, 4500);
           emp.employeeAddress("Bangalore");
           emp.employeeDetails();
           emp.test();
           emp.bankDetails(); //  BankAccountDetails  
           emp.accountDetails();
         
         new BankRBI();// HAS-A 
         new BankRBI(4.5,5.5);// two argment constructor of BankRBI
         BankRBI.getBankDetails();
         
         
        
         
	}

}
