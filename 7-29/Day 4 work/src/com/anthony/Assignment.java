package com.anthony;

import java.util.*;

public class Assignment {
	
	public static void main(String[] args) {
		//Linked List
//		
		System.out.println("Linked List");
		System.out.println("");
//		 * 1. Write a Java program to append the specified element to the end of a linked list.
		LinkedList<String> colorsLinkedList = new LinkedList<String>();
		colorsLinkedList.add("Red");
		System.out.println(colorsLinkedList);
		System.out.println("");
//		 * 2. Write a Java program to iterate through all elements in a linked list. 
		colorsLinkedList.add("Orange");
		colorsLinkedList.add("Yellow");
		colorsLinkedList.add("Green");
		for (Iterator<String> i = colorsLinkedList.iterator(); i.hasNext();) {
			
			System.out.println(i.next());
			
		}
		System.out.println("");
//		 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
		ListIterator l_i = colorsLinkedList.listIterator(2);
		while (l_i.hasNext()) {
			
			System.out.println(l_i.next());
			
		}
		System.out.println("");
//		 * 4. Write a Java program to iterate a linked list in reverse order.
		Iterator<String> reverseIterate = colorsLinkedList.descendingIterator();
		while(reverseIterate.hasNext()) {
			System.out.println(reverseIterate.next());
		}
		System.out.println("");
//		 * 5. Write a Java program to insert the specified element at the specified position in the linked list. 
		System.out.println("Before");
		System.out.println(colorsLinkedList);
		colorsLinkedList.add(0, "Pink");
		System.out.println("After");
		System.out.println(colorsLinkedList);
		System.out.println("");
		
//		//Hash Set
		System.out.println("Hash Set");
//		 * 1. Write a Java program to append the specified element to the end of a hash set. 
		HashSet<String> namesHashSet = new HashSet<String>();
		namesHashSet.add("John");
		System.out.println(namesHashSet);
		namesHashSet.add("Will");
		System.out.println(namesHashSet);
//		 * 2. Write a Java program to iterate through all elements in a hash list. 
		System.out.println("");
		namesHashSet.add("Josh");
		namesHashSet.add("Jane");
		namesHashSet.add("Louis");
		for (Iterator<String> i = namesHashSet.iterator(); i.hasNext();) {
			
			System.out.println(i.next());
			
		}
		System.out.println("");
//		 * 3. Write a Java program to get the number of elements in a hash set.
		System.out.println(namesHashSet.size());
//		 * 4. Write a Java program to empty an hash set.
		System.out.println("");
		System.out.println("Before");
		System.out.println(namesHashSet);
		namesHashSet.clear();
		System.out.println("After");
		System.out.println(namesHashSet);
		System.out.println(""); 
		
//		//TreeSet
		System.out.println("TreeSet");		
//		 *Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
		TreeSet<String> colorsTreeSet = new TreeSet<String>();
		colorsTreeSet.add("Red");
		colorsTreeSet.add("Orange");
		colorsTreeSet.add("Yellow");
		colorsTreeSet.add("Green");
		colorsTreeSet.add("Blue");
		colorsTreeSet.add("Indigo");
		colorsTreeSet.add("Violet");
		System.out.println(colorsTreeSet);
		System.out.println("");
//		 *2. Write a Java program to iterate through all elements in a tree set.
		for(Iterator<String> i = colorsTreeSet.iterator(); i.hasNext();) {
			
			System.out.println(i.next());
			
		}
		System.out.println("");
//		 *3. Write a Java program to add all the elements of a specified tree set to another tree set.
		TreeSet<String> colorsTreeSetClone = (TreeSet<String>) colorsTreeSet.clone();
		System.out.println("Original");
		System.out.println(colorsTreeSet);
		System.out.println("Cloned");
		System.out.println(colorsTreeSetClone);
		System.out.println("");
//		 *4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
		System.out.println("Reverse Order");
		System.out.println(colorsTreeSet.descendingSet());
//		 *5. Write a Java program to get the first and last elements in a tree set 
		System.out.println("");
		System.out.println("First");
		System.out.println(colorsTreeSet.first());
		System.out.println("Last");
		System.out.println(colorsTreeSet.last());
	}

}
