package com.wordpress.Testcases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadingAndWriting {

	@Test
	public void WritingReading() {

		/*
		 * try { FileReader fr = new
		 * FileReader("/Users/labuser/Downloads/Testtextfolder/sample-text-file.txt");
		 * BufferedReader br = new BufferedReader(fr);
		 * 
		 * String str; while((str= br.readLine())!=null) {
		 * 
		 * System.out.println(str);
		 * 
		 * } br.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
//	--------------------------------------------
		
		 File file = new File("/Users/labuser/Downloads/Testtextfolder/sample-text-file.txt"); 
	try {
		 Scanner sc = new Scanner(file);
		 
		 while(sc.hasNextLine()) 
		 {
		 System.out.println(sc.nextLine()); 
		 }
		 
	}catch (FileNotFoundException e) 
		 { 
		  e.printStackTrace(); 
		  }
		 

		/*
		 * File file = new
		 * File("/Users/labuser/Downloads/Testtextfolder/sample-text-file.txt"); try {
		 * Scanner sc = new Scanner(file);
		 * 
		 * sc.useDelimiter("\\Z"); System.out.println(sc.next());
		 * 
		 * 
		 * } catch (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}

}
