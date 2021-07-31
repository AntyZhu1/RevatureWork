package com.anthony;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
	
	public static void main(String[] args) {
		
		System.out.println("Enter File Name");
		Scanner userIn = new Scanner(System.in);
		String nameOfFile = userIn.nextLine();
		
		try {
			File selectedFile = new File(nameOfFile);
			Scanner readFile = new Scanner(selectedFile);
			while (readFile.hasNextLine()) {
				String output = readFile.nextLine();
				System.out.println(output);
			}
			readFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found. Create New File?");
			boolean exitingProgram = false;
			while (exitingProgram == false) {
				String userCommand = userIn.nextLine();

				if (userCommand.toLowerCase().equals("yes") | userCommand.toLowerCase().equals("y") ) {
					System.out.println("Creating File...");
					File create = new File(nameOfFile);
					createFile(create);
					System.out.println("File Created!");
					exitingProgram = true;
				}
				else if (userCommand.toLowerCase().equals("no") | userCommand.toLowerCase().equals("n")) {
					System.out.println("Ok, closing.");
					exitingProgram = true;
					userIn.close();
				}
				else {
					System.out.println("Sorry, I didn't catch that command. Would you like to create a new File?");
				}
			}

		}
		
		
		
		
	}
	
	public static boolean checkFile(File fileToCheck) {
		
		return fileToCheck.exists();
		
	}
	
	public static void createFile(File fileToCreate) {
		
		try {
			fileToCreate.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
