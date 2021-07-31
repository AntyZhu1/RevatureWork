package com.anthony;

import java.io.File;

public class WorkingWithFiles {
	public static void main(String[] args) {
//		File f = new File("file.txt");
//		System.out.println(f.exists());
		
		File f = new File("hi.txt");
		System.out.println(f.exists());
		f.mkdir();
	}
}
