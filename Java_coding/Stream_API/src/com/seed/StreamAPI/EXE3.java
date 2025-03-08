package com.seed.StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Map method
public class EXE3 {

	public static void main(String[] args) {
		List<Integer> list=
		 new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		System.out.println(list);		
		
		List<Integer> res=list.stream().
				map(value -> value*10).
				collect(Collectors.toList());
				
		System.out.println(res);
	}
}
