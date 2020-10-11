import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		e.name=sc.nextLine();
		System.out.print("Enter date of DOB: ");
		e.dateOfDOB=sc.nextInt();
		System.out.println("Enter month of DOB: ");
		e.monthOfDOB=sc.nextInt();
		System.out.println("Enter year of DOB: ");
		e.yearOfDOB=sc.nextInt();
		System.out.println("Enter monthly salary: ");
		e.monthlySal=sc.nextInt();
		sc.close();

		
		double sal = e.calcAnnualSal();
		e.displayName();
		e.ageCalc();
		if(sal>=500000) {
			double tax=(sal*20)/100;
			System.out.println("salary: "+sal+" with tax amount of "+tax);
		}
		else if(sal<500000 && sal >=400000) {
			double tax=(sal*15)/100;
			System.out.println("salary: "+sal+" with tax amount of "+tax);
		}
		else if(sal < 400000 && sal >= 300000) {
			double tax=(sal*10)/100;
			System.out.println("salary: "+sal+" with tax amount of "+tax);
		}
		else if(sal < 300000 && sal >= 200000) {
			double tax=(sal*5)/100;
			System.out.println("salary: "+sal+" with tax amount of "+tax);
		}
		else {
			System.out.println("Salary"+sal);
		}
	}
	
}
