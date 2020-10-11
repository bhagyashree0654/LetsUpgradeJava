
public class Employee {
	
	String name;
	int dateOfDOB;
	int monthOfDOB;
	int yearOfDOB;
	double monthlySal;

	public void ageCalc() {
		int year=2020-yearOfDOB;
		System.out.println("Age: "+year);
		
	}
	public double calcAnnualSal() {
		return 12*monthlySal;		
	}
	public void displayName() {
		System.out.println("Name: "+name);
	}
	
}
