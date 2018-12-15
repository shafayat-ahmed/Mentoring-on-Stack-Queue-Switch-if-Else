
import java.util.Scanner;
public class IfElseExample {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of the month =");
		int month=in.nextInt();
		
		if(month==1) {
			System.out.println("The month you are looking for is January");
		}
		else if(month==2) {
			System.out.println("The month you are looking for is February");
		}
		else if(month==3) {
			System.out.println("The month you are looking for is March");
		}
		else if(month==4) {
			System.out.println("The month you are looking for is April");
		}
		else if(month==5) {
			System.out.println("The month you are looking for is May");
		}
		else if(month==6) {
			System.out.println("The month you are looking for is June");
		}
		

	}

}
