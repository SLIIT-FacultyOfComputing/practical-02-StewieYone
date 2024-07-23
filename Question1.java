import java.util.Scanner;

public class Question1 {
    public static void main(String args[]) {
        
        // Question1 part1
        System.out.println("\n\t\t\tQuestion 1 Part 1\n");
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        Scanner keyboardInput = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder modifiedString = new StringBuilder();
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
        
        // Question1 part2

        System.out.println("\n\t\t\tQuestion 1 Part 2\n");
        String anotherName;
        System.out.println("Enter another full name: ");
        anotherName = keyboardInput.nextLine();
        if (result.compareTo(anotherName) == 0) {//compare if the result and anotherName is equal
            System.out.println("Names are equal");
        } else {
            System.out.println("Names are not equal.");
        }

        
        // Question1 part3

        System.out.println("\n\t\t\tQuestion 1 Part 3\n");
        for (char c : result.toCharArray()) {//loop through the results String
            if (c == 'a') {
                modifiedString.append('@');//replace a with @ and add it to the StringBuilder
            } else if (c == 'e') {
                modifiedString.append('3');//replace e with 3 and add it to the StringBuilder
            } else {
                modifiedString.append(c);//if the char is niether a nor e just add it to the StringBuilder String.
            }
        }
        System.out.println("Modified String : ");
        System.out.println(modifiedString.toString());
        String upperCaseString = result.toUpperCase();//convert ecery char to UPPERCASE
        System.out.println("Upper Case String : ");
        System.out.println(upperCaseString);

        
        // Question1 part4


        System.out.println("\n\t\t\tQuestion 1 Part 4\n");
        String[] splittedNameCommas = result.split(","); //splitting the string by commas and add it to an array named splittedNameCommas
        for (int i = 0; i < splittedNameCommas.length; i++) { //loop through splittedNameCommas
            String[] parts = splittedNameCommas[i].split(" "); //If can split each item by <space> in that array amd add it to a new array called parts
            for (int j = 0; j < parts.length; j++) { //loop through each item in that array
                System.out.println(parts[j]);//display the splitted elements
            }
        }

        
        // Question1 part5


        System.out.println("\n\t\t\tQuestion 1 Part 5\n");
        System.out.println("Enter a string with leading and trailing spaces : ");
        String nameWithSpaces;
        nameWithSpaces = keyboardInput.nextLine();
        String nameWithoutSpaces = nameWithSpaces.trim(); //Trimming the extra whitespace
        System.out.println(nameWithoutSpaces);

        
        // Question1 part6

        System.out.println("\n\t\t\tQuestion 1 Part 6\n");
        for (char c : result.toCharArray()) { //loop through the result String
            for (int i = 0; i < vowels.length; i++) { //loop through the vowels array
                if (c == vowels[i]) {
                    count++;
                }
            }
        }
        System.out.printf("Vowels Count : %d", count);
    }
}

//IT23281950
//OOAD Lab02