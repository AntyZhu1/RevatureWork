package com.anthony;

import java.util.Collections;


import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaCollectionsTesting {
	public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList();
	
	al.add("First");
	al.add("Second");
	
	
//	System.out.println(al);
	
	LinkedList<String> namesLinked = new LinkedList<>();
	namesLinked.add("Joe");
	namesLinked.add("Jill");
	namesLinked.add("Jane");
	
	System.out.println(namesLinked);
	
	
	Iterator i = namesLinked.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		}
	Map<String, Integer> map = new HashMap<>();
	map.put("Hello", 1);
	
	Map<Integer, String> sortedMap = new TreeMap<>();
	
	}
	
	
	}
