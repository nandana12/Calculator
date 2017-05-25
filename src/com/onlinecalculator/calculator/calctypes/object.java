package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
public class object {
    static void display()
    {
    	 int x=10;
    	 Scanner s=new Scanner (System.in);
    	 System.out.println("local variable x="+x);
    }
    public class intancetest
    {
     public void main (String args [])
      {
    	 object s=new object();
    	 s.display();
      }
    }     	
}