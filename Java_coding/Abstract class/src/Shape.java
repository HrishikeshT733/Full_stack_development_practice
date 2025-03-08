//abstract class
public abstract class Shape {
   public float area;
   public final float pi=3.14f;
   //non-abstract Behaviour:
   public void showList(){
	   System.out.println("1.Circle 2.Rectangle 3.Square");
   }
   //abstract behaviour
   public abstract void calArea();
	
}
