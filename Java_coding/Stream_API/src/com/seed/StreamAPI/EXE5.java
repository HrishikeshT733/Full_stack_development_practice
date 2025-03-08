package com.seed.StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Other Methods: Peek,distinct,limit,skip,count
public class EXE5 {

	public static void main(String[] args) {
	List<Integer> list=
		 new ArrayList<>(Arrays.asList(1,2,5,4,5,6));

	System.out.println(list);
System.out.println("***************Peek*****************");	
	
	List<Integer> res=
			list.stream().
		filter(value->value%2==0).
	peek(value->System.out.println("Filtered: "+value)).
	map(value->value*10).collect(Collectors.toList());
		
	System.out.println(res);
		
System.out.println("***************Distinct*****************************");
	
List<Integer> ans=list.stream().
				distinct().
				collect(Collectors.toList());
System.out.println(ans);
		
System.out.println("***************Limit 4*****************************");
	
List<Integer> ans1=list.stream().
				limit(4).
				collect(Collectors.toList());
	System.out.println(ans1);
		
System.out.println("*****************Skip 2***************************");
		
List<Integer> ans2=list.stream().
				skip(2).
				collect(Collectors.toList());
	System.out.println(ans2);
//
System.out.println("******************Count****************************");
		Long count=list.stream().count();
		System.out.println("Total elements are: "+count);
	}

}
