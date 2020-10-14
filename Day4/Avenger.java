import java.util.Scanner;

public class Avenger {
	
	String name;
	int age;
	String power;
	String weapon;
	String planet;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		Avenger[] details=new Avenger[5];
		
		for(int i=0 ; i<5 ; i++) {
			details[i]=new Avenger();
			details[i].getDetails();
			details[i].displayDetails();
		}
	}
	
	public void getDetails() {		
			System.out.print("Enter Name: ");
			name=sc.nextLine();
			
			System.out.print("Enter age: ");
			age=sc.nextInt();
			
			System.out.print("Enter power: ");
			power=sc.next();
			
			System.out.print("Enter weapon: ");
			weapon=sc.next();
			
			System.out.print("Enter planet");	
			planet=sc.next();
	}
	
	public void displayDetails() {
		System.out.print("Name: "+name);
		System.out.print("  Age: "+age);
		System.out.print("  Power: "+power);
		System.out.print("  Weapon: "+weapon);
		System.out.println("  Planet: "+planet);			
	}
	

}
