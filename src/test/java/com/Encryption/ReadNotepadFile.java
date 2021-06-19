package com.Encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotepadFile {

	public static void main(String[] args) {
		
		BufferedReader reader;
		
		try
		{
			reader=new BufferedReader(new FileReader("E:/Training/PeopleNTech/BITM Online 1/11th Class/Password_data.txt"));
			String line=reader.readLine();
			
			
			while(line !=null)
			{
				System.out.println(line);
				
				//To Read next line
				line=reader.readLine();
			}
			
			reader.close();
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
