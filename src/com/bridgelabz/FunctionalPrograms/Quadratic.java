package com.bridgelabz.FunctionalPrograms;
import java.util.*;
import java.lang.Math;
public class Quadratic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a");
		double a = in.nextDouble();
		System.out.println("Enter b");
		double b = in.nextDouble();
		System.out.println("Enter c");
		double c = in.nextDouble();
		double delta = b*b - 4*a*c;
		System.out.println("The two root equations are");
		if(delta>0.0)
		{
			double root1 = (-b + Math.sqrt(delta))/(2*a);
			double root2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("The roots are: "+root1+ " and "+root2);
		}
		else if(delta==0.0)
		{
			double root1 = -b/(2*a);
			System.out.println("The root is"+root1);
		}
		else
		{
			System.out.println("The root are not real");
		}
		
		
		
		
	}

}
