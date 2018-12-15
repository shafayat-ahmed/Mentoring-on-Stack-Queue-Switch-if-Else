import java.util.Scanner;
public class StringSwtichExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter month name=");
		String month=input.nextLine();
		month.toLowerCase();
		
		switch(month) {
		case "january":
			System.out.println("1");
			break;
		case "february":
			System.out.println("2");
			break;
		case "march":
			System.out.println("3");
			break;
		case "april":
			System.out.println("4");
			break;
		case "may":
			System.out.println("5");
			break;
		case "June":
			System.out.println("6");
			break;
		//default:
			//System.out.println("Invalid month");
		
		
		}

	}

}
