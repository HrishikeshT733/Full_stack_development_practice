import java.util.HashMap;
import java.util.*;

public class MapDemo {
public static void main(String[] args) {
	System.out.println("*************HashMap*****************");
	HashMap hm1=new HashMap();
	hm1.put(101, "Rahul Dravid");
	hm1.put(102, "Ms Dhoni");
	hm1.put(103, "Virat Kohli");
	hm1.put(104, "Suresh Raina");
	
	hm1.replace(101, "Rohit Sharma");
	hm1.remove(104);
	System.out.println(hm1);
	System.out.println("*******************");
	Set set=hm1.entrySet();
	Iterator i=set.iterator();
	while(i.hasNext()){
		Map.Entry me=(Map.Entry)i.next();
		System.out.println(me.getKey()+" ");
		System.out.println(me.getValue());
	}
	
	System.out.println("***********TreeMap ASC***************");
	TreeMap hm=new TreeMap();
	hm.put(4, "Akshay Kumar");
	hm.put(2, "Hritik Roshan");
	hm.put(3, "Allu Arjun");
	hm.put(1, "Allu Arjun");
	hm.put(3, "Madhuri Dixit");
	System.out.println(hm);
	hm.remove(4);
	System.out.println(hm);
	Set set1=hm.entrySet();
	Iterator it1=set1.iterator();
	while(it1.hasNext()){
		Map.Entry me=(Map.Entry)it1.next();
		System.out.println(me.getKey()+" ");
		System.out.println("Actor: "+me.getValue());
	}
	System.out.println("**********Tree Map DESC***************");
	Map Treemap=new TreeMap(Collections.reverseOrder());
	Treemap.put("74683487838", new Student(24,"harish"));
	Treemap.put("78290389723", "SRK");
	Treemap.put("87928347743", "Alia bhat");
	
	Treemap.replace("78290389723", "Palak mishra");
	
	System.out.println(Treemap);
	
	Set se1=Treemap.entrySet();
	Iterator i1=se1.iterator();
	while(i1.hasNext()){
		Map.Entry me1=(Map.Entry)i1.next();
		System.out.println(me1.getKey()+" ");
		System.out.println("Actor: "+me1.getValue());
	}
	
	
	
	
	
}
}
