//lab exercise 4
public class MathClass2 {
//varargs or ellipses
	public int add(int...num){
		int res=0;
		for(int i=0;i<num.length;i++)
			res=res+num[i];
		  return res;
	}
	public static void main(String[] args) {
		MathClass2 num=new MathClass2();
		System.out.println("addition Ouput 1 for 1,2,3 integers: "+num.add(1,2,3));
		System.out.println("addition Ouput 1 for 1,2,3,4 integers: "+num.add(1,2,3,4));
		System.out.println("addition Ouput 1 for 1,2,3,4,5 integers: "+num.add(1,2,3,4,5));
	}
}
