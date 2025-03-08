//example 5
public class ticketMain {
public static void main(String[] args) {
	classTicket s1=new classTicket();
	s1.setTicketId(101);
	s1.setPrice(200);
	int cost=s1.calculateTotalCost(3);
	if(cost>0){
	System.out.println("Total cost for tickets is: Rs "+cost);
	System.out.println("No of available tickets: "+s1.getAvailableTicket());
	}else{
		System.out.println("Sorry tickets are unavailable");
	}
	
	
}
}
