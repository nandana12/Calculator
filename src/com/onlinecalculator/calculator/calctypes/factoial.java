package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class factoial {

	public static void main(String[] args) {
	

			int i,fact=1;
			int no;
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the no:");
			no=sc.nextInt();
			for (i=5;i>=1;i--)
			{
				fact=fact*i;
				
			}
			System.out.println("factorial of "+no+" is:"+fact);
	}

}
