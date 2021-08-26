package com.session3.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  array[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,29}
				};
		
		for (int row=0;row<=2;row++) {
			
			for(int col=0;col<=2;col++) {
				System.out.print(array[row][col] + "\t");
			}
			
			System.out.println();
		}
		
		
		}

	}


