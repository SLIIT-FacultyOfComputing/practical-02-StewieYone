import java.util.Scanner;

public class Question1{
	public static void main(String args[]){
	//Question1 part1
		Scanner keyboardInput = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder modifiedString  = new StringBuilder();
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
		
	//Question1 part3
		for (char c : result.toCharArray()) {
			if(c=='a'){
				modifiedString.append('@');
			}else if(c=='e'){
				modifiedString.append('3');
			}else{
				modifiedString.append(c);
			}
		 }
		 System.out.println("Modified String : ");
		 System.out.println(modifiedString.toString());
		 String upperCaseString = result.toUpperCase();
		 System.out.println("Upper Case String : ");
		 System.out.println(upperCaseString);
  
		
	}
}
