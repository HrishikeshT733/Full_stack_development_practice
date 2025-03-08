//lab exercise 3
public class MathClass {
	//method overloading 
	//for integers
public int add(int a,int b){
	return a+b;
}
// for float values
public float add(float a, float b){
	return a+b;
}
//for strings
public String add(String a,String b){
	return a.concat(b);
	// return a+b;  //this is also correct return type for string concatenation
	
}

public static void main(String[] args) {
	MathClass num1=new MathClass();
	System.out.println("Intergers addition:3,4 = "+num1.add(3, 4));
	System.out.println("Float addition:2.5,5.5 = "+num1.add(2.5f, 5.5f));
	System.out.println("String Concatenation:Ram ,Kale = "+num1.add("Ram", "Kale"));
	
	
}
}
