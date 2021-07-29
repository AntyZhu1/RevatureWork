package com.anthony;

import java.util.Collections;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Scanner;  // Import the Scanner class

public class CollectionsPractice {
	
	
	public static boolean isInColors(ArrayList<String> colors, String color) {
		
		return colors.contains(color);
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Write a Java program to create a new array list, add some colors (string) and print out the collection. 
		ArrayList<String> colors = new ArrayList();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println(colors);
		
		System.out.println("");
		
		//Write a Java program to iterate through all elements in a array list. 
		Iterator<String> colorIterator = colors.iterator();
		while (colorIterator.hasNext()) {
			System.out.println(colorIterator.next());
		}
		System.out.println(" ");
		
		//Write a Java program to insert an element into the array list at the first position.
		colors.add(0,"Yellow");
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(colors.get(0));
		System.out.println("");
		
		//Write a Java program to update specific array element by given element.
		colors.set(0, "Purple");
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to remove the third element from a array list. 
		colors.remove(2);
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to search an element in a array list.
		
		//see function isInColors()
		System.out.println(isInColors(colors, "Red"));
		System.out.println("");
		
		//Write a Java program to sort a given array list. 
		
		Collections.sort(colors);
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to copy one array list into another.
		ArrayList<String> colorsCopy = new ArrayList();
		colorsCopy = (ArrayList<String>) colors.clone();
		
		System.out.println("Colors " + colors);
		System.out.println("Copy of Colors " + colorsCopy);
		System.out.println("");

		//Write a Java program to shuffle elements in a array list.
		
		//adding more to be randomized
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Indigo");
		
		//shuffling
		Collections.shuffle(colors);
		System.out.println(colors);
		Collections.shuffle(colors);
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to reverse elements in a array list. 
		Collections.sort(colors);
		System.out.println(colors);
		
		Collections.reverse(colors);
		System.out.println(colors);
		System.out.println("");

		//Write a Java program to extract a portion of a array list. 
		List<String> colorSublist = colors.subList(0, 5);
		System.out.println(colors);
		System.out.println(colorSublist);
		System.out.println("");
		
		//Write a Java program of swap two elements in an array list.
		System.out.println(colors);
		Collections.swap(colors, 0, 5);
		System.out.println(colors);
		System.out.println("");
		
		//Write a Java program to associate the specified value with the specified key in a HashMap.
		HashMap<Integer, String> colorHashMap = new HashMap<>();
		colorHashMap.put(1, "Red");
		

		//Write a Java program to count the number of key-value (size) mappings in a map.
		colorHashMap.put(2, "Orange");
		colorHashMap.put(3, "Yellow");
		colorHashMap.put(4, "Green");
		colorHashMap.put(5, "Blue");
		colorHashMap.put(6, "Indigo");
		colorHashMap.put(7, "Violet");
		
		System.out.println("Hashmap Size: " + colorHashMap.size());
		
		System.out.println("");

		//Write a Java program to copy all of the mappings from the specified map to another map.
		HashMap<Integer,String> colorHMClone = (HashMap<Integer, String>) colorHashMap.clone();
		
		//adding color to differentiate
		colorHMClone.put(8, "White");
		
		System.out.println("Original :" + colorHashMap);
		System.out.println("Clone :" + colorHMClone);
		

		
	}

}
