package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;
public class StatisticCalc extends BasicCalc{
	double no_array[];
	public int menu()
	{

    	System.out.println("*****select option***");
    	System.out.println("1.addition");
    	System.out.println("2.subtraction");
    	System.out.println("3.multiplication");
    	System.out.println("4.division");
    	System.out.println("5.mean");
    	System.out.println("6.median");
    	System.out.println("7.mode");
        System.out.println("8.standard deviation");
        System.out.println("9.exit");
    	System.out.println("enter your choice");
    	Scanner s=new Scanner (System.in);
    	ch=s.nextInt();
    	return ch;
  	
	}

    public void userInputs()
    {
    	 Scanner s=new Scanner (System.in);
    	  	if(ch>=5 && ch<=8)
    	  	{
    	  		System.out.println("enter the total no. of values:");
    	  		int len=s.nextInt();
    	  		no_array = new  double[len];
    	  		for(int i=0;i<no_array.length;i++ )
    	  		{
    	  			System.out.println("enter data:");
    	    	  	no_array[i]=s.nextInt();
    	  		}
    	  	
    	  	 }
    	  		else
    	  		{	
    	  		System.out.println("enter first no:");
    	  	    a=s.nextInt();
    	  		System.out.println("enter second no:");
    	  	  	b=s.nextInt();
    	  	  	
    	  		}
  }
    	  	


    public void performOperation(){    	
    		switch(ch)
    		{

      		case 1:
         	case 2:
      	    case 3:
      	    case 4:
      		       super.performOperation();
      		       break;
      	    case 5:
      	           System.out.println(mean());
      	           break;
      	    case 6:
      	           System.out.println(median());
      	           break;
      	    case 7:
      	           System.out.println(mode());
      	           break;
      	    case 8:System.out.println(Math.sqrt(mode()));
	               break;
      	    case 9:
      	           System.out.println("bye");
      	           System.exit(0);
      	           break;
      	   default:System.out.println("wrong choice!!!");
      	           break;
      	  }
      		 System.out.println("\n-----------\n");
      	    
      		   
      }
      
       
    
    
	double mean()
	{
		double sum=0;
		for(int i=0;i<no_array.length;i++ )
  		{
  		  sum +=no_array[i];
  		}  
	    double meanValue =sum/no_array.length;
	    return(meanValue);
	}
	
	double median()
	{
		int middle =no_array.length/2;
		if(no_array.length%2==1)
		{
			 double medianValue =no_array[middle];
			    return(medianValue);
			}
		else
		{
			double medianValue =(no_array[middle-1]+no_array[middle])/2.0;
		    return(medianValue);
		}
	}
	
	double mode()
	{
	   double modeValue =no_array[0];
		int maxCount=0;
		for(int i=0;i<no_array.length;i++ )
  		{
			 double Value =no_array[i];
			   int count=1;
			   for(int j=0;j<no_array.length;j++ )
		  		{ 
				   if(no_array[i]==Value)
					count++;
				   if(count> maxCount)
				   {
					   modeValue=Value;
					   maxCount=count;
				   }
		  		}
	    }
		return(modeValue);
	}


}






















