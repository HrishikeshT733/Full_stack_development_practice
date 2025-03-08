
public class Gen<T> {
 T ob;

public Gen(T ob) {
	super();
	this.ob = ob;
}

public Gen() {
	super();
}

public T getOb() {
	return ob;
}


public static void main(String[] args) {
	//java 7 feature -Diamond operator
	Gen<Integer>iob=new Gen<Integer>(new Integer(100));
	System.out.println(iob.getOb());
	
	Gen<String>sob=new Gen<String>(new String("Suresh"));
	String msg=sob.getOb();
	System.out.println(msg);
	
	Gen<Float>fob=new Gen<Float>(new Float(10.45f));
	System.out.println(fob.getOb());
	
	Gen<Student>stud=new Gen(new Student(108,"ram"));
	System.out.println(stud.getOb());
}
}
