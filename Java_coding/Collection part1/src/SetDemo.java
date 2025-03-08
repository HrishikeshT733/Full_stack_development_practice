import java.util.HashSet;
import java.util.*;

public class SetDemo {
public static void main(String[] args) {
	System.out.println("************Hash Set***************");
	//hashset will print the elements randomly without any sequence and as it is a type of set it will only print distinct elements by ignoring duplicates
	HashSet hs=new HashSet();
	System.out.println("Before adding elements in hashset its size is :"+hs.size());
	hs.add("doll");
	hs.add("ant");
	hs.add("cat");
	hs.add("bat");
	hs.add("eat");
	hs.add("goat");
	hs.add("fat");
	hs.add("hat");
	hs.add("zoo");
	hs.add("hat");
	hs.add(null);
	System.out.println(hs);
	System.out.println("after adding elements in hashset its size is :"+hs.size());
	hs.remove("goat");
	System.out.println(hs);
	System.out.println(hs.size());
	
	Iterator i=hs.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	System.out.println("************LinkedList****************");
	//Linked Hash set will print elements as it is given in input order
	LinkedHashSet hs1=new LinkedHashSet();
	hs1.add("doll");
	hs1.add("ant");
	hs1.add("cat");
	hs1.add("bat");
	hs1.add("eat");
	hs1.add("goat");
	hs1.add("fat");
	hs1.add("hat");
	hs1.add("zoo");
	hs1.add("hat");
	hs1.add(null);
	System.out.println(hs1);
	
	System.out.println("**************TreeSet***************");
	//treeset will print elements in ascending order in sorted list
	TreeSet hs2=new TreeSet();
	hs2.add("doll");
	hs2.add("ant");
	hs2.add("cat");
	hs2.add("bat");
	hs2.add("eat");
	hs2.add("goat");
	hs2.add("fat");
	hs2.add("hat");
	hs2.add("zoo");
	hs2.add("hat");
	System.out.println(hs2);
	
	System.out.println("************NavigableSet**************");
	//Navigable set is a child class of Treeset for Navigable set "Treeset " has to be defined ,Navigable set will print the elements in reverse order using "descendingSet()" method  i.e in descending order
	NavigableSet treerev=hs2.descendingSet();
	System.out.println(treerev);
	Iterator it=treerev.iterator();
	System.out.println("Values in descending order");
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	
}
}
