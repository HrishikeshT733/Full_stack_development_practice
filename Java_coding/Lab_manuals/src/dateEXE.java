//lab-exercise 2 -problem statement 1,2
public class dateEXE {
 public static void main(String[] args) {
	Date dt=new Date();
	dt.setuu(04);//here i change setter name in Date class 
	dt.setMm(10);
	dt.setYy(2001);
	System.out.println(dt.getDd()+"-"+dt.getMm()+"-"+dt.getYy());
	Date dt1=new Date();
	dt1.setMm(8);
	dt1.setuu(6);
	dt1.setYy(2034);
	System.out.println(dt1.getDd()+"-"+dt1.getMm()+"-"+dt1.getYy());
	
	Date dt2=new Date(9,11,2005);
	System.out.println(dt2.getDd()+"-"+dt2.getMm()+"-"+dt2.getYy());
	
}
 
 

 

}
