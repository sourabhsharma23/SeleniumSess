package com.wordpress.Testcases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class WritingFile {

	@Test
	public void fileWriting() throws IOException {
		
		FileWriter fr = new FileWriter("/Users/labuser/Downloads/Testtextfolder/sample-text-file.txt");
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Java Selenium TestNG Maven Jenkins");
		br.write("API Testing using Postman");
		br.write("API Testing using RestAssured Java Library");
		
		br.close();
		
	}
}
