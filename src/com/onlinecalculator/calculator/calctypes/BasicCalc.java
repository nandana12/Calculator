package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

 class Calc
{
	int a,b,c,res,ch;
	public Calc()
	{
		a=0;
		b=0;
		c=0;
		res=0;
		
	}
	
	public int menu()
    {
    	System.out.println("*****select option***");
    	System.out.println("addition");
    	System.out.println("subtraction");
    	System.out.println("multiplication");
    	System.out.println("division");
    	System.out.println("*******");
    	System.out.println("enter your choice");
    	Scanner s=new Scanner (System.in);
    	ch=s.nextInt();
    	return 0;
	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner (System.in);
    	System.out.println("enter first no");
    	a=s.nextInt();	
    	System.out.println ("enter second  no");
    	b=s.nextInt();
    }

    public void performOperation()
{
  switch (ch)
  {
    case 1:System.out.println("addition:"+res);
           res=add();
           System.out.println(res);
           break;
    case 2:System.out.println("subtraction:"+res);
           res=subtract();
           System.out.println(res);
           break;
    case 3:System.out.println("multiplication:"+res);
           res=multiply();
           System.out.println(res);
           break;
    case 4:System.out.println("division:"+res);
           res=divide();
           System.out.println(res);
           break;
   default:System.out.println("invalid choice");
  }
}
    
	int add()
	{
		c=a+b;
		return(c);
	}
	
	int subtract()
	{
		c=a-b;
		return(c);
	}
	
	int multiply()
	{
		c=a*b;
		return(c);
	}
	
	int divide()
	{
		c=a/b;
	    return(c);
	}
	
}
public class BasicCalc 
{
	public static void main (String args [])
	{
		Calc c=new Calc();
		c.menu();
		c.userInputs();
		c.performOperation();
	}	
}
