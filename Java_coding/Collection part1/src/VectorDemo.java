import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v=new Vector(5,3);//Parameters (5,3) will initially initialized vector with capacity 5 and as new element comes it will increase memory size by 3 
	//by default vector will create 10X10 grid if no parameters given i.e =new vector();
	System.out.println("initial size "+v.size());
	System.out.println("Intial capacity "+v.capacity());
	v.addElement(new Integer(1));
	v.addElement(new Integer(2));
	System.out.println("Capacity after addition 1= "+v.capacity());
	v.addElement(3);
	System.out.println("Capacity after addition 2= "+v.capacity());
	v.addElement(new Float(23.5f));
	v.addElement(new Float(23.5f));
	v.addElement("India");
	v.addElement(8.5f);
	v.addElement(true);
	System.out.println("Capacity after addition 3= "+v.capacity());
	System.out.println("Size after addition = "+v.size());
	System.out.println("Final element : "+(Boolean)v.lastElement());//it will also print output if typecasting is not done
	System.out.println("First element : "+(Integer)v.firstElement());//it will also print output if typecasting is not done
	
}
}
