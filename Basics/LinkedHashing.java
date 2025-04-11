package newProject;

import java.util.*;
public class LinkedHashing
{
	public static void main(String[] args)
	{
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); //no guarantee of order of elements
	
			
		map.put("A", 40);
		map.put("b", 54);
		map.put("c", 39);
		map.put("d", 18);
		
		System.out.println(map);
	}}