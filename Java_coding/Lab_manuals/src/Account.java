import java.util.Scanner;

public class Account {
//static variable declaration
	public static float interestRate;
	public int accountID;
	public String accountName;
	public double balance;
	
	public Account(int accountID, String accountName, double balance) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public Account() {
		super();
	}

	//static block
	static{
		interestRate=8.5f;
	
	}
	//static method
	public static void getInterestRate(){
		System.out.println(interestRate);
	}
	
	class Locker{
		 int locId;

		public Locker(int locId) {
			super();
			this.locId = locId;
		}

		public Locker() {
			super();
		}
		public void print(Account d){
			System.out.println("AccountId: "+d.accountID+" AccountName: "+d.accountName+" Balance: "+d.balance);
		}
	}
	
	public void withdrawl(Account a) throws LessBalanceException{
		System.out.println("Enter amount you want to withdraw ");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
	    if(w<=a.balance){
	    	System.out.println("Withdrawl of rs "+w+" is successful");
	    	System.out.println("Remaining bal is "+(a.balance-w));
	    }else{
	    	throw new LessBalanceException("Balance is not sufficient in your account"); 
	    }
	}
}
