
public class StringBuilderDemo {
	public static void main(String[] args) {
		//StringBuffer sb=new StringBuffer("hello");
		StringBuilder sb=new StringBuilder("hello");
		System.out.println("Capacity: "+sb.capacity());
		sb.append("  Welcome Welcome Welcome");
		System.out.println(sb);
		System.out.println("Length: "+sb.length());
		System.out.println("Capacity: "+sb.capacity());
		sb.reverse();
		System.out.println(sb);
	}

}
