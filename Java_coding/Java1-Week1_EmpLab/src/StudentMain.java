
public class StudentMain {
	public static String s1input="yes";
	public static String s2input="no";
	public static void main(String[] args) {
		if(s1input=="yes"){
			Student s1=new Student("101", "Shree", "Pune-32120");
			System.out.println(s1);
		
		}if(s2input=="no"){
			Student s2=new Student("102", "Hrishikesh", "Satara24627", " ssgmce shegaon");	
			System.out.println(s2);
		}else{
			System.out.println("Wrong input");
		}
		
		
		
	}
}
