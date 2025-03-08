//client side code
public class ShowEmployeeDetails{
  public static void showDetails(Employee emp){
	  
	  if(emp instanceof Manager){
		  Manager mg=(Manager)emp;
		  mg.calGrosssal();
		  mg.calNetsal();
		  System.out.println(mg);
		
	  }else if(emp instanceof MarketingExecutive){
		  MarketingExecutive me=(MarketingExecutive)emp;
		  me.calGrosssal();
		  me.calNetsal();
		  System.out.println(me);
	  }
	  
  }
  public static void main(String[] args) {
	Manager se=new Manager(101, "Sirish", 20000, 1000, 0, 0, new Date(2,4,2003), 1000, 2000, 500);
	showDetails(se);
	System.out.println();
	 MarketingExecutive sr=new  MarketingExecutive(102, "krish", 30000, 3000, 0, 0, new Date(3,4,2006), 400);
	 showDetails(sr);
	
}

}
