
public class SwapMain {
public static void main(String[] args) {
	Date d[]=new Date[2];
	d[0]=new Date(01,02,2003);
	d[1]=new Date(03,06,2007);
	System.out.println(d[0]+" "+d[1]);
	Date.swapDate(d);
	System.out.println(d[0]+" "+d[1]);
	
	
}


}
