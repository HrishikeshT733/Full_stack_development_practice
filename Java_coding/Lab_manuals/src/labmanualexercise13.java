
public class labmanualexercise13 {
	public static void main(String[] args) {
		
	
Date d1=new Date(1,2,2009);
Date d2=new Date(1,2,2009);
Date d3=d2;
boolean flag;
if(d3.equals(d2)){
	flag=true;
}else{
	flag=false;
}
System.out.println("d3 and d2 objects are equal true or false?: "+flag);

if(d1.equals(d2)){
	flag=true;
}else{
	flag=false;
}

System.out.println("d1 and d2 objects are equal true or false?: "+flag);
System.out.println("Hashcode of d1: "+d1.hashCode());
System.out.println("Hashcode of d2: "+d2.hashCode());
System.out.println("Hashcode of d3: "+d3.hashCode());
}
}