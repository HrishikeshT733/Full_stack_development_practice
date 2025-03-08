package com.seed.StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//sorted method
public class EXE4 {

	public static void main(String[] args) {
		List<Integer> list=
	 new ArrayList<>(Arrays.asList(10,2,43,24,15,6));
	
	System.out.println("Ascending order");
	
	list.stream().sorted().forEach(System.out::println);
		
	System.out.println("Descending order");
	
	list.stream().sorted(Comparator.reverseOrder()).
	forEach(System.out::println);
	}
}
