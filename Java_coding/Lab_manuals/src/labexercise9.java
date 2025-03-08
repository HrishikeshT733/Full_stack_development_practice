
public class labexercise9 {
	public static void swap(Date[] date){
		Date temp;
		temp=date[0];
		date[0]=date[1];
		date[1]=temp;
	}
public static void main(String[] args) {
	Date[] date=new Date[2];
	for(int i=0;i<date.length;i++){
		date[i]=new Date();
	}
	
	date[0].setuu(4);;
	date[0].setMm(11);
	date[0].setYy(2011);
	
	date[1].setuu(5);;
	date[1].setMm(10);
	date[1].setYy(2055);
	
	System.out.println("Before swapping: date1: "+date[0]+" date2: "+date[1]);
	swap(date);
	System.out.println("After swapping: date1: "+date[0]+" date2: "+date[1]);
	
	
	
}
}
