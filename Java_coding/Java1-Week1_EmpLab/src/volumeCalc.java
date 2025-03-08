//Example-2
public class volumeCalc {
private double volume;
final public float PI=3.14f;
public double calcVolume(double radius,double height){
	volume=PI*radius*radius*height;
	return volume;
}
public double calcVolume(int length,int breadth,int height){
	volume=length*breadth*height;
	return volume;
}

}
