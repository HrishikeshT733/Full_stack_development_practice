
public class Lab_Exercise17_main {
public static void main(String[] args) {
	Account saving=new Account(201,"Pankaj",2000000);
	Account.Locker nw= saving.new Locker(101);
	nw.print(saving);
}
}
