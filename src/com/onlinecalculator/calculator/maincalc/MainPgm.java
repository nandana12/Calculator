package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;


import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[])
{
        int type;
     
       
        type=disp();
         
        if(type==1)
        {
        	BasicCalc c=new BasicCalc();
    		c.menu();
    		c.userInputs();
    		c.performOperation();
        }
        if(type==2)
        {
        	 ScientificCalc scalc=new ScientificCalc();
      		scalc.menu();
      		scalc.userInputs();
      		scalc.performOperation();
       	}
        	
        	if(type==3)
        	{
        		 StatisticCalc statc=new StatisticCalc();
        	 		statc.menu();
        	 		statc.userInputs();
        	 		statc.performOperation();
        	 }
  }
        
  
    	static int disp()
    	{
    		int ch;
    		  Scanner sc=new Scanner(System.in);
    		System.out.println("****CALCULATOR****");
        	System.out.println("**1.BASIC CALCULATOR**");
        	System.out.println("**2.SCIENTIFIC CALCULATOR**");
        	System.out.println("**3.STATISTIC CALCULATOR**");
        	System.out.println("enter your choice");
        	ch=sc.nextInt();
        	return(ch);
        			
        			}
    		
    }
    
