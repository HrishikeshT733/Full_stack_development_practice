
public class StringMethodDemo {
public static void main(String[] args) {
	String s="SEED";
	String s2="seed";
	if(s.equalsIgnoreCase(s2))
		System.out.println("equal");
	else
		System.out.println("Not equal");
	
	System.out.println(s);
	
	s=s+"  Infotech";
	System.out.println(s);
	String s1=s.concat("  Pune");
	System.out.println(s1);
	String sUpper=s.toUpperCase();
	System.out.println(sUpper);
	int idx=s1.indexOf('I');
	System.out.println("Index No of 'I' is "+idx);
	String s3=s1.substring(6,10);
	System.out.println(s3);
}
}
