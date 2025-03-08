import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
public static void main(String[] args) {
	//ArrayList numList=new ArrayList(); //this will also work
	LinkedList numList=new LinkedList<>();
	System.out.println("Size before add: "+numList.size());
	numList.add(new Integer(45));
	numList.add(100);
	numList.add(true);
	numList.add("O+Ve");
	numList.add(15.54f);
	numList.add('Y');
	numList.add(0,45);
	numList.add(new String("Apple"));
	numList.add(4567.556);
	System.out.println("Size After add: "+numList.size());
	
	//using for each loop
	System.out.println("Using for each loop");
	for(Object val:numList)
	{
		System.out.println(val);
	}
	System.out.println("*******************************");
	 //using iterator
	System.out.println("\nUsing Iterator");
	Iterator it=numList.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("***********************************");
	//using get method
	System.out.println("\nUsing get method");
	for(int i=0;i<numList.size();i++){
		Object ele=numList.get(i);
		System.out.println(ele);
	}
	
	
}
}
