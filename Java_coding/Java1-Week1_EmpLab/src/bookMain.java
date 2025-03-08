//example 3
public class bookMain {
public static void main(String[] args) {
	
	//classBook b1=new classBook();
	// classBook[] arr={new classBook(),new classBook(),new classBook()}; //this is also one of the method for array
	classBook[] arr=new classBook[3]; 
	for(int i=0;i<arr.length ;i++){
		arr[i]=new classBook();
	 }
	
	arr[0].setBookName("Sherlock Holmes:The hounds of baskervile's");
	arr[0].setBookPrice(400);
	arr[0].setAuthorName("Hrishikesh");
	
    arr[1].setBookName("Abc");
    arr[1].setBookPrice(200);
	arr[1].setAuthorName("Hrishikesh");
	
	arr[2].setBookName("cbc");
    arr[2].setBookPrice(300);
	arr[2].setAuthorName("Hrishikesh");
		
		classBook search=new classBook();
		classBook sort=new classBook();
	
	System.out.println("Details of the books are:\nBook name: "+arr[0].getBookName()+"\nBook Price: Rs "+arr[0].getBookPrice()+"\nBook Author name: "+arr[0].getAuthorName());
   // String name=arr[1].getBookName(); 
    //example 4
	sort.sortbyName(arr);
	search.searchbyName("cbc", arr);

}

}
