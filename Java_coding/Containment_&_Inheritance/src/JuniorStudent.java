
public class JuniorStudent extends Student{
	//Junior Student is a Student //inheritance 
	String branchName;

	public JuniorStudent() {
		super();
	}

	public JuniorStudent(int rollNo, String name, float marks, Address resadd, MyDate dd, String branchName) {
		super(rollNo, name, marks, resadd, dd);
		this.branchName = branchName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return super.toString()+"\nJuniorStudent [branchName=" + branchName + "]";
	}
	

	
	

}
