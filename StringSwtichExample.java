import java.util.Scanner;
public class StringSwtichExample {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter month name=");
		String month=input.nextLine();
		month.toLowerCase();
		
		switch(month) {
		case "January":
			System.out.println("1");
			break;
		case "February":
			System.out.println("2");
			break;
		case "March":
			System.out.println("3");
			break;
		case "April":
			System.out.println("4");
			break;
		case "May":
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
