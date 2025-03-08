
public class SwapNumbers {
public void swap(int num1,int num2){
	//swapping logic
	num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;
	
}
public static void main(String[] args) {
	int num1=10,num2=20;
	System.out.println("Before swapping: "+num1+" "+num2);
	SwapNumbers exe=new SwapNumbers();
	exe.swap(num1, num2);//here swapping doesn't work because pass by reference is not possible in java and also the scope of variables is limited within function therefore changes doesn't reflect in main 
	System.out.println("After swapping: "+num1+" "+num2);
	System.out.println("***********************************");
	 int num[]={10,20};
	 System.out.println("Before swapping: "+num[0]+" "+num[1]);
	 exe.swap(num);//to avoid above issue, we use array subscript method/function,it actually swaps addresses of the array elements
	 System.out.println("After swapping: "+num[0]+" "+num[1]);
}
public void swap(int[] num) {
        num[0]=num[0]+num[1];
        num[1]=num[0]-num[1];
        num[0]=num[0]-num[1];
	
}

}
