package newProject;

import java.util.*;
public class hashprac
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>(); //no guarantee of order of elements
		//LinkedHashMap<String, Integer> map = new LinkedHashMap<>();//input order
		//TreeMap<String, Integer> map = new TreeMap<>();//inorder 
			
		map.put("A", 40);
		map.put("b", 54);
		map.put("c", 39);
		map.put("d", 18);
		
		System.out.println(map);
	}}