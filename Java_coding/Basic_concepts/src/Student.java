
public class Student {
//Data Members: ABSTRACTION
	public String name;
	public int rollNo;
	public float p,c,m,result;
	
	
	//default constructor --when parameterized constructor is defined we need to write default constrcutor compulsory
	public Student() {
		super();
	}

	
	//Constructor with parameters
	public Student(String name, int rollNo, float p, float c, float m) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.p = p;
		this.c = c;
		this.m = m;
	}

	
	//Accessor and Mutator
	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public float getP() {
		return p;
	}

	public void setP(float p) {
		this.p = p;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getM() {
		return m;
	}

	public void setM(float m) {
		this.m = m;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}	
	//Member function: ENCAPSULATION
	
		 public float calculateResult(float p,float c,float m){
			 float res;
			 res=(p+c+m)/3;
			 return res;
		 }
}

