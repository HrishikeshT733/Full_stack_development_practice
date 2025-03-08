package com.seed.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EXE1 {	
	public static void main(String[] args) {
	List<String> names=
Arrays.asList("Amruta","Abhishek","Yash","Ram","Anay");
		System.out.println(names);
List<String> finalResult=
				names.stream().
				filter(name->name.startsWith("A")).
				map(String::toLowerCase).
				collect(Collectors.toList());

		
	System.out.println(finalResult);
	}

}
