
public class WrapperDemo {
public static void main(String[] args) {
	int i=10;
	int j=9;
	Integer x=new Integer(i);//wrapping i.e primitive to class
	Integer y=new Integer(j);
	System.out.println(x.compareTo(y));//returns 1 ,0,-1
	System.out.println(x.doubleValue());
	int z=x.intValue();//unwrapping i.e class to primitive data type
	
}
}
