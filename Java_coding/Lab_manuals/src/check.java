
public class check implements Cloneable{
	int num;
	String name;
      public static void main(String[] args) throws CloneNotSupportedException {
    	  check c=new check();
		c.name="harish";
		c.num=2;
		check c2=(check) c.clone();
		System.out.println(c2.name+" "+c2.num);
		
	}
}
