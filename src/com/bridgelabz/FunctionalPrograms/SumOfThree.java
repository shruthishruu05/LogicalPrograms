package com.bridgelabz.FunctionalPrograms;

public class SumOfThree {
	public static void main(String[] args) {
		int array[] = {0, -1, 2, -3, 1};
		int arrayLength = array.length;
		System.out.println("the length is:"+arrayLength);
		int count =0;
		System.out.println("The distinct triplets are");
		for(int i=0;i<arrayLength-2;i++)
		{
			for(int j=i+1;j<arrayLength-1;j++)
			{
				for(int k=j+1;k<arrayLength;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						count++;
						
						System.out.print(array[i]);
						System.out.print(" ");
						System.out.print(array[j]);
						System.out.print(" ");
						System.out.print(array[k]);
						System.out.print("\n");
						
						
					}
				}
			}
		}
		System.out.println("the number of distinct triplets is: "+count);
	}

}
