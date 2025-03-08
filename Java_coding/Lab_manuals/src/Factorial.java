
public class Factorial {
public static void main(String[] args) {
	 int num1=5;
	int f= fact(num1);
	
}
public static int fact(int num){
	return num*fact(num-1);
	
}
}
