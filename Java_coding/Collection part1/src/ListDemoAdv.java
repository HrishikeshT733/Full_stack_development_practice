import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class ListDemoAdv {
public static void main(String[] args) {
	//ArrayList<Integer>a1=new ArrayList<Integer>();
	LinkedList<Integer>a1=new LinkedList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	System.out.println(a1);
	
	//retrieving element in ArrayList
	System.out.println(a1.get(1));
	System.out.println("------All elements with enhanced for loop-------");
	//printing arraylist a1 with for each loop
	for(Integer i1:a1){ //here we can also use "for(Object i1:a1){"
		System.out.println(i1);
	}
	System.out.println("printing all elements with iterator interface");
	Iterator<Integer>it=a1.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	//deleting elements in arraylist a1
	System.out.println("After deleting element");
	a1.remove(1);
	a1.add(2, 55);
	a1.set(3, 50);
	System.out.println(a1);
	
	System.out.println("Before sorting: ");
	System.out.println(a1);
	Collections.sort(a1); //here Collections is a class and sort is a static method in that class
	System.out.println("After sorting: ");
	System.out.println(a1);
	Collections.sort(a1,Collections.reverseOrder());
	System.out.println("After sorting in descending order : ");
	System.out.println(a1);
	
	//
	ArrayList<String> names=new ArrayList<String>();
	//LinkedList<String> names=new LinkedList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 5 names");
	for(int i=0;i<5;i++){
		names.add(sc.next());
	}
	System.out.println("*************All names are*************");
	for(String s:names){
		System.out.println(s);
	}
	
}
}
