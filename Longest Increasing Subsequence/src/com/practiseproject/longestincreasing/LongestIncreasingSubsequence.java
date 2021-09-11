package com.practiseproject.longestincreasing;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
	

	// function to generate subsequences for every index
	static ArrayList<Integer> updateList(int arr[],int len,int index)
	{
		ArrayList<Integer> list = new ArrayList<>();		
		list.add(arr[index]);
         for (int j=index+1;j<arr.length;j++) 
         {
				if(arr[j] > arr[index])
				{
				list.add(arr[j]);
				index=j;
			    }	
		}
                  
         return list;
	 }
	
	// function to generate longest sequence array
	static int[] fillArray(ArrayList<Integer> list2) {
		int[] arr = new int[list2.size()];
		for (int j=0;j<list2.size();j++) {
			arr[j]=list2.get(j);
			}
		return arr;
	}	
		
	public static void subSequences(int[]arr) {
		
		int a1[] = new int[arr.length]; // Initialize variables to save sequence length
		ArrayList<Integer> a2 = new ArrayList<>(); // Variable to save indexes with same long sequences and that is the longest sequence
		int longestSubsequence[]= {0};// Initialize the Longest sequence array with zero
		int k =0;
		int temp=0;
		for (int i=0;i<arr.length;i++)
		{
//		System.out.println("for index "+ i);
//		System.out.println("***********");
		ArrayList<Integer> list1 = 	updateList(arr,arr.length,i);//Generate subsequence
		a1[i] = list1.size();	
//		System.out.println("list size = "+a1[i]);
		// For the first index
		if(i==0) {			
			a2.add(i);		
			longestSubsequence = fillArray(list1);
//			System.out.println("a2 from i =0 " + a2.get(0));
			k++;
			}
		
		//for rest of the indexes		
		else {
			
			// when the returned list is the same size as the last one
			if(a1[i]==a1[i-1]) {
				a2.add(i);//update index in index store list
//				System.out.println("index "+i+"-"+"a2 from i > 0 with same size as before " + a2.get(k));
				k++;
				temp=a1[i];
			}
			
			//when returned list size is greater than last one			
			else if(a1[i]>a1[i-1]) {				
				a2.clear();//clear index list
				k=0;
				a2.add(i);
				longestSubsequence = fillArray(list1);
//				System.out.println("index "+i+"-"+"a2 from i > 0 with size bigger than before " + a2.get(0));
					}
			
			else {
				a1[i] = a1[i-1];;//for getting the longest list alone
			}
			}
			
			
		}
		
		if(a2.size()==1) {
			System.out.println("The longest increasing subsequence starting with the element at array index " + a2.get(0) +" is ");
			
			for(int x: longestSubsequence) {
				System.out.print(x+" ");
			}
			
			System.out.println("\nLength of the longest increasing subsequence is " + longestSubsequence.length);
		}
		else {
		System.out.println("Following indexes are having the longest sequences and all are of same length " + temp);
		for (int i:a2) {
		System.out.println("The sequence for index " + i +" is ");	
		ArrayList<Integer> list1=updateList(arr,arr.length,i);
		for(int x: list1) {
			System.out.print(x+" ");
		}
		System.out.println();
		}
		
		}	
	}
	

	public static void main(String[] args) {
		//int arr [] = {12,3,44,11,10,32,11,13,12,10,45,60};	
		int arr[] = {10,22,9,33,21,50,41,60,80};
		subSequences(arr);
		

	}



}
