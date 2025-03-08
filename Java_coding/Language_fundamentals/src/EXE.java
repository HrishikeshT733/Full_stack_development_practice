
public class EXE {
static{
	System.out.println("Static block 3");
}
static{
	System.out.println("Static block 1");
	SeedInfotech.main(null);
}
public static void main(String[] args) {
	//EXE e=new EXE();
	System.out.println("Thank you for visit");
}
static{
	System.out.println("Static block 2");
}
}
