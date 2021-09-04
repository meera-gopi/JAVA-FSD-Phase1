package com.practiseproblems.filehandling;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandleUserFront {
	


	public static void main(String[] args) {
		
		FileHandling handle = new FileHandling();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the action you wish to perform");
		System.out.println("\t 1. Create a new File and add data to it");
		System.out.println("\t 2. Add data to an existing file");
		System.out.println("\t 3. Read the data from an existing file");
		System.out.print("\n\t Enter the choice : ");
		
		
		int action = Integer.parseInt(sc.nextLine());				
		
		switch (action)
		{
			case 1:
				
			try 
			{
				handle.createFile();
			} catch (IOException e) 
			{
				
				e.printStackTrace();
			}
				break;
				
			case 2 :
			try 
			{
				handle.appendToFile();
			} 
			
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
				break;
			
			case 3:
			List<String> result;
			try 
			{
				result = handle.readFromFile();
				System.out.println("Content of the selected file is as follows : \n \t");
				Iterator<String> iterator = result.iterator();
				
				while(iterator.hasNext()) 
				{
					System.out.println(iterator.next());
				}
				
				
			} 
			
				catch (IOException e) 
			{
				
				e.printStackTrace();
			}
				
				
				}
				
				
				
				
				
				
				
				
		}
		

	}


