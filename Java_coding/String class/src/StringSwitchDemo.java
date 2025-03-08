
public class StringSwitchDemo {
	public static void main(String[] args) {
		String day="Monday";
		switch(day){
			case "Monday":
				System.out.println("Attend college");
				break;
			case "Thursday":
				System.out.println("Go to coaching classes");
				break;
			case "Saturday":
				System.out.println("Picnic");
				break;
			case "Sunday":
				System.out.println("Weekly off");
				break;
			default:
				System.out.println("oops...wrong choice");
				break;
		}
	}

}
