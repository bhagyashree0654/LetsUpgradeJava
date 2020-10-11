import java.util.Scanner;

public class PercentageCalc {

	
	public static void main(String[] args) {
		
		Student s= new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st subject mark");		
		s.first_sub= sc.nextInt();
		System.out.println("Enter 2nd subject mark");
		s.second_sub= sc.nextInt();
		System.out.println("Enter 3rd subject mark");
		s.third_sub= sc.nextInt();
		System.out.println("Enter 4th subject mark");
		s.fourth_sub= sc.nextInt();
		System.out.println("Enter 5th subject mark");
		s.fifth_sub= sc.nextInt();
		s.displayMark();
		float percent=s.percentage();
		sc.close();
		
		if(percent>80) 
			System.out.println("Grade A+");
		else if(percent<=80 && percent >70) 
			System.out.println("Grade A");
		else if(percent<=70 && percent >60) 
			System.out.println("Grade B");
		else if(percent <= 60 && percent > 50) 
			System.out.println("Grade C");
		else 
			System.out.println("Fail..!!!");		

	}

}
