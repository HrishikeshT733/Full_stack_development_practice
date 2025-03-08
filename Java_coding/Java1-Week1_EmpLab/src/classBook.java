//example 3
public class classBook {
private String bookName;
private  int bookPrice;
private  String authorName;
//Constructors
public classBook() {
	super();
}

public classBook(String bookName, int bookPrice, String authorName) {
	super();
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	this.authorName = authorName;
}
 //getters and setters

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public int getBookPrice() {
	return bookPrice;
}

public void setBookPrice(int bookPrice) {
	this.bookPrice = bookPrice;
}

public String getAuthorName() {
	return authorName;
}

public void setAuthorName(String authorName) {
	this.authorName = authorName;
}

@Override
public String toString() {
	return "[bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName=" + authorName + "]";
}

//methods
//example 4
public void searchbyName(String name,classBook[] arr){
	boolean temp=false;
	for(int i=0;i<arr.length;i++){
	if(name==arr[i].getBookName()){
	   System.out.println("Name found");
	   temp=true;
	   break;
	}
	}if(temp==false){
		System.out.println("Name not found");
	}
}

public void sortbyName(classBook[] arr){
	///bubble sort
	int i = 1,j;
	classBook temp;
	int comparisons;
	for (i = 1;i <= arr.length - 1;i++) {
		comparisons = arr.length-i;
		for (j = 0;j < comparisons;j++) {
			if (arr[j].getBookName().compareToIgnoreCase(arr[j+1].getBookName())>0){
				//temp = arr[j].getBookName(); //this is not possible 
				//arr[j].getBookName().equals(arr[j+1].getBookName());
				//arr[j + 1].getBookName().equals(temp);
				temp=arr[j];//here we are swapping whole object
				arr[j]=arr[j+1];
				arr[j+1]=temp;

			}
		}
	}
	
for(classBook x:arr)
	System.out.println(x);
}

}
