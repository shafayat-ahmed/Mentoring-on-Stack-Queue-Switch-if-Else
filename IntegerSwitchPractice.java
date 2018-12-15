import java.util.Scanner;

public class IntegerSwitchPractice {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter month number=");
		int month=input.nextInt();
		
		switch(month){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			default:
				System.out.println("Please enter number from 1 to 6");
		}
		

	}

}
