package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	
	public int menu(){

    	System.out.println("*****select option***");
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.multiplication");
    	System.out.println("4.division");
    	System.out.println("5.power of");
    	System.out.println("6.square root of");
    	System.out.println("7.sine of");
        System.out.println("*******");
    	System.out.println("enter your choice");
    	Scanner s=new Scanner (System.in);
    	ch=s.nextInt();
    	return ch;
  	
	}

  public void userInputs()
  {
	  Scanner s=new Scanner (System.in);
  	System.out.println("enter first no:");
  	a=s.nextInt();
  	if(ch!=6 && ch!=7)
  	{
  		System.out.println("enter second no:");
  	  	b=s.nextInt();
  	}
  	
  }

  public void performOperation(){
  		
  		switch (ch)
  	  {
  		case 1:
     	case 2:
  	    case 3:
  	    case 4:
  		       super.performOperation();
  		       break;
  	    case 5:
  	           System.out.println(pwrof());
  	           break;
  	    case 6:
  	           System.out.println(sqrtof());
  	           break;
  	    case 7:
  	           System.out.println(sineof());
  	           break;
  	    case 8:
  	           System.out.println("bye");
  	           System.exit(0);
  	           break;
  	   default:System.out.println("wrong choice!!!");
  	           break;
  	  }
  		 System.out.println("\n-----------\n");
  	    
  		   
  }
  
	double pwrof()
	{
		System.out.println("power");
		return (Math.pow(a,b));
	  	
	}
	
	double sqrtof()
	{
		return (Math.sqrt(a));
	}

	double sineof()
	{
		
        double rad= Math.toRadians(a); 	
		return (Math.sin(rad));
	}

	 		
	
public static void main (String args [])
	{
		   int x;
	    Scanner s=new Scanner (System.in);
	  	System.out.println("enter either 1.BasicCalc or 2.ScientificCalc");
	  	x=s.nextInt();
	  	if(x==1)
	  	{
	  		BasicCalc c=new BasicCalc();
			c.menu();
			c.userInputs();
			c.performOperation();
		}	
	  	
	  	
	  	if(x==2)
	  	{
	  		 ScientificCalc scalc=new ScientificCalc();
	 		scalc.menu();
	 		scalc.userInputs();
	 		scalc.performOperation();
	  	}
	}
}