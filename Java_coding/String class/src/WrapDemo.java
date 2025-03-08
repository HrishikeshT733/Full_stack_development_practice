
public class WrapDemo {
public static void main(String[] args) {
	int i=10;
	Integer x=new Integer(i);//primitive to wrapper (wrapping happens)
	Integer z=i;
	System.out.println(x);
	System.out.println(z);
	
	int p=x.intValue();//wrapper to primitive (unwrapping)
    int l=x;
	System.out.println(p);
	System.out.println(l);
	
	String s="52";//String to primitive(Unwrapping)
	int d=Integer.parseInt(s);
	System.out.println(d);
	
	Integer a=Integer.valueOf(s);//String to Wrapper(Wrapping)
	System.out.println(a);
	
}
}
