package com.epam.Cleancode;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the option:\n1:Calculate Interest\n2:Estimate House Cost");
        int op=sc.nextInt();
        if(op==1) {
        	System.out.println("Enter Prinicipe Amount");
        	double p=sc.nextDouble();
        	System.out.println("Enter Total Time period");
        	double t=sc.nextDouble();
        	System.out.println("Enter Rate Of Interest");
        	double r=sc.nextDouble();
        	System.out.println("Enter an option :\n1:Simple Interest\n2:Compound Interest");
        	int opt=sc.nextInt();
        	if(opt==1) {
        		Simple simple=new Simple(p,t,r);
        		System.out.println("Simple Interest is :"+simple.simp()+"INR");
        	}
        	else if(opt==2) {
        		Compound compound=new Compound(p,t,r);
        		System.out.println("Compound Interest is :"+compound.comp()+"INR");
        	}
        }
        else if(op==2) {
        	System.out.println("Enter the area of the house");
        	double area=sc.nextDouble();
        	System.out.println("Enter Material Standards you need :");
        	System.out.println("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High Standard Material And Fully Automated House");
        	int opn=sc.nextInt();
        	House house=new House(area,opn);
        	System.out.println("Total Cost for constructing the house is :"+house.hou()+"INR");
        }
        else {
        	System.out.println("Invalid Option");
        }
        sc.close();
    }
}
