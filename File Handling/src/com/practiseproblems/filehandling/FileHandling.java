package com.practiseproblems.filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileHandling {
	
	  Scanner sc = new Scanner(System.in);	  	  
	  
	  String getFilePath() 
	  {
		    System.out.println("Enter the location where the file is available or to be saved \n");
			
		    String filepath = sc.nextLine(); 
		    		    
		    System.out.println(" \n Enter the preferred file name for the new file ");
		    System.out.println(" \t \t OR \n Enter an existing File name to continue the selected process \n");
			
		    System.out.print("\n\t Enter the filename : ");
		    String fileName = sc.nextLine();
		
		    return filepath + fileName;
	  }
	  
	  String getData()
	  {
		  System.out.println("\nEnter the data to be stored in file - ");
		  
		  String s1=sc.nextLine();
		  return s1;
	  }
	
public void createFile() throws IOException {
	    	
	    String file = getFilePath();    
	
	    String data = getData();
		
		Path path = Paths.get(file);
		
		Files.write(path, data.getBytes(),StandardOpenOption.TRUNCATE_EXISTING,StandardOpenOption.CREATE);
		
		System.out.println("Created the new file and added the entered data to it");
		
		
	}
	
	
	public void appendToFile() throws IOException,NoSuchFileException {
		
		String file = getFilePath();    
		
		String data = System.lineSeparator()+ getData();
	    
		Path path = Paths.get(file);
		
		if(Files.isWritable(path))
		{
		Files.write(path, data.getBytes(),StandardOpenOption.APPEND);
		System.out.println("Data successfully entered to the selected file");
		
		}
		
		else {
			throw new NoSuchFileException("File entered is not available in the given location");
		}
		
	}
	
   public List<String> readFromFile( ) throws IOException,NoSuchFileException {
	    
	   String file = getFilePath(); 
	
		List<String> lines = Collections.emptyList();
		Path path = Paths.get(file);
		
		if(Files.isReadable(path)) {
		
		lines = Files.readAllLines(path,StandardCharsets.UTF_8);
		
		return lines;}
		else {
			throw new NoSuchFileException("File entered is not available in the given location");
		}
		
		
		
		
	}
	

}
