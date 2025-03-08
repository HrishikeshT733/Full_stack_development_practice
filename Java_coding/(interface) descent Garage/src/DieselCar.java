import java.util.Scanner;

public class DieselCar extends Car{
	
	@Override
	public void milegecar(){
		System.out.println("Diesel car has 3 free services");
	}
	@Override
	public void calBill(){
		System.out.println("Enter choice 1.Washing-100rs 2.Oiling-800rs 3.For both");
	Scanner sc =new Scanner(System.in);
	int bill=sc.nextInt();
	if(bill==1){
		System.out.println("Total bill is Rs 100");
	}else if (bill==2){
		
		System.out.println("Total bill is Rs 800");
	}else if(bill==3){
		
		System.out.println("Total bill is "+(100+800));
	}else{
		System.out.println("Entered wrong choice");
	}
	
	
	}
}
