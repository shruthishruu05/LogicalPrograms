package com.bridgelabz.FunctionalPrograms;

public class WindChill {
	public static void main(String [] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w;
		
		if(t>50) {
			System.out.println("Enter value of t less than 50");
		}
		if(v>120 && v<3) {
			System.out.println("Enter value of v greater than 120 or less than 3");
		}
		
		if(t<50 && (v>120 || v<3)) {
			w = 35.74 + (0.6215*t) + (0.4275*t - 35.75)*Math.pow(v,0.16);
			System.out.println("the wind chill : "+w);
		}
	}
}
