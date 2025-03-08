
public class LessBalanceException extends Exception{
	String msg;

	public LessBalanceException(String msg) {
		super();
		this.msg = msg;
	}

	public LessBalanceException() {
		super();
	}

	@Override
	public String toString() {
		return "Balance is not sufficient in your account";
	}
	

}
