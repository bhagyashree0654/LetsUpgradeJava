import java.util.Scanner;

public class AddArrayElement {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int[] values= new int[5];
		System.out.println("Enter numbers one by one:");
		for(int i=0 ; i<5 ;i++) {
			
			values[i]=sc.nextInt();			
			sum+=values[i];
			
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
