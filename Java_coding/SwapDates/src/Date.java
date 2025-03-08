
public class Date {
int dd;
int mm;
int yy;

//constructors
public Date(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}
public Date() {
	super();
}
@Override
public String toString() {
	return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}

public static void  swapDate(Date d[]){
	Date temp;
	temp=d[0];
	d[0]=d[1];
	d[1]=temp;
	
	
}

}
