//example 5
public class classTicket {
private int ticketId;
private int price;
private static int availableTicket=4;

//getters and setters
public int getTicketId() {
	
	return ticketId;
	
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public static int getAvailableTicket() {
	if(availableTicket>0){
	return availableTicket;
	}else{
		return 0;
	}
}
public static void setAvailableTicket(int availableTicket) {
	classTicket.availableTicket = availableTicket;
}
 //methods
public int calculateTotalCost(int noOfTickets){
	if(availableTicket>0 && availableTicket>=noOfTickets){
	availableTicket=availableTicket-noOfTickets;
	return price*noOfTickets;
	
	}else{
		return -1;
	}
}

}
