//lab manual 5 --constructor chaining using this keyword
public class Date2 {
	public int dd,mm,yy;

	public Date2(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		System.out.println("This is parameterized constructor");
	}
	public Date2() {
	//the constructor call must be the first statement in any constructor, This rule ensures that the parent or the base constructor initializes the object before any other operations occur.
		this(3,2,2011);
		System.out.println("This is default constructor");
    }
	//we can create multiple constructor chains 

public static void main(String[] args) {
	Date2 dt=new Date2();
	System.out.println(dt.dd+"-"+dt.mm+"-"+dt.yy);
}
	
}
