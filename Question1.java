import java.util.Scanner;

public class Question1{
	public static void main(String args[]){
	//Question1 part1
		Scanner keyboardInput = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String firstName;
		String middleName;
		String lastName;
		System.out.println("Enter your first name: ");
		firstName = keyboardInput.nextLine();
		System.out.println("Enter your middle name: ");
		middleName = keyboardInput.nextLine();
		System.out.println("Enter your last name : ");
		lastName = keyboardInput.nextLine();
		sb.append(lastName);
		sb.append(",");
		sb.append(firstName);
		sb.append(" ");
		sb.append(middleName);
		String result = sb.toString();
		System.out.println(result);
	//Question1 part2
		String anotherName;
		System.out.println("Enter another full name: ");
		anotherName = keyboardInput.nextLine();
		if (result.compareTo(anotherName)==0){
			System.out.println("Names are equal");
		}else{
			System.out.println("Names are not equal.");
		}
		
	}
}
