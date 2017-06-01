package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class arithopr {
	public static void main (String args [])
	{
		int a,b;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter first no");
	    	a=s.nextInt();	
	    	System.out.println ("enter second  no");
	    	b=s.nextInt();

	    	System.out.println(a+b);
	    	System.out.println(a-b);
	    	System.out.println(a*b);
	    	System.out.println(a/b);
	    	System.out.println(a%b);
	    	}
}
