package com.bridgelabz.FunctionalPrograms;

import java.io.PrintWriter;

import java.util.*;

public class TwoDArray {
	
	public static void printArray(int Array[][],int M,int N) {
		
		PrintWriter writer = new PrintWriter(System.out);
		writer.println("The 2D array is :");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				writer.print(Array[i][j]+" ");
			}
			writer.println();
		}
		writer.flush();  
	    writer.close();
		
	}
	public static void main(String[] args) {
		int M,N;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows and colums:");
		M = in.nextInt();
		N = in.nextInt();
		
		int array[][] = new int[M][N];
		System.out.println("Enter array elements of size "+M+"*"+N+": ");
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				array[i][j] = in.nextInt();
			}
		}
		printArray(array,M,N);
	}
}
