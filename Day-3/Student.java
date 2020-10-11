

public class Student {
	int first_sub;
	int second_sub;
	int third_sub;
	int fourth_sub;
	int fifth_sub;
	
	public float percentage() {
		float per;
		float total=first_sub + second_sub+ third_sub + fourth_sub + fifth_sub;
		per= (total/500)*100;
		System.out.println("Percentage= "+per+"%");
		return per;	
	}
	
	public void displayMark() {
		System.out.println("First paper: "+first_sub);
		System.out.println("Second paper: "+second_sub);
		System.out.println("Third paper: "+third_sub);
		System.out.println("Fourth paper: "+fourth_sub);
		System.out.println("Fifth paper: "+fifth_sub);
	}

}
