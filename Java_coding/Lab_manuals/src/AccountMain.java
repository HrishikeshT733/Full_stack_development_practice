import java.util.Scanner;

public class AccountMain {

public static void main(String[] args){
	Account.getInterestRate();
	
	Account a=new Account(201,"Harish",20000);
	try{
	a.withdrawl(a);
	}catch(LessBalanceException e){
		System.err.println(e);
	}
	
    System.out.println("Transaction finished");
    System.out.println("********************************");
    System.out.println("using assertion");
    System.out.println("new Transaction");
   System.out.println("Enter you want to withdraw");
   Scanner sc=new Scanner(System.in);
	int w=sc.nextInt();
	assert w >20000: "Balance is not sufficient";
	System.out.println("Withdrawl of rs "+w+" is successful");
	System.out.println("Remaining bal is "+(a.balance-w));
}
}
