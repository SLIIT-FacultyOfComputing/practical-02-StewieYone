//Question 1 and 2(Practical Questions)
//IT23281950

import java.util.Scanner;

public class Question2 {
    public static void main(String args[]){
        Scanner keyboardInput = new Scanner(System.in);
        int nOfStudents ;
        int nofSubjects = 3;
        System.out.println(">>>How many students are there : ");
        nOfStudents = keyboardInput.nextInt();
        keyboardInput.nextLine();
        int [][] studentMarks = new int[nOfStudents][nofSubjects];

        
        while (true) {
            String command;
            String firstWord;
            System.out.println("\n>>>Enter your command ... \n::Example commands:: (add [studentID] | update [studentID] [subjectID] [mark] | average_s [studentID] | average [studentID] |  total [studentID] | quit) |");
            System.out.print("Or type <grades> for viewing the grades of Students...\n");
            command = keyboardInput.nextLine();
            System.out.print("\n");
            firstWord = command.split(" ")[0].toUpperCase();
            int studentID = 0;
            if(!firstWord.equals("GRADES") && !firstWord.equals("QUIT")){
                studentID = Integer.valueOf(command.split(" ")[1]); //

            }
            if (firstWord.equals("ADD") && command.split(" ").length==2) {
                if(studentID > 0 && studentID <= nOfStudents){
                    for(int i = 0 ; i < nofSubjects ; i++){
                        studentMarks[studentID-1][i] = 0;
                    }
                    System.out.printf(">>>ADDED %d", studentID);
                }else{
                    System.out.println(">>>Invalid Student ID");
                }
                
            }else if(firstWord.equals("UPDATE") && command.split(" ").length==4){
                int subjectID = Integer.valueOf(command.split(" ")[2]);
                int marks = Integer.valueOf(command.split(" ")[3]);
                if(subjectID <= nofSubjects && subjectID > 0 && studentID > 0 && studentID <= nOfStudents && marks >= 0 && marks <= 100){
                    studentMarks[studentID - 1][subjectID - 1] = marks;
                    System.out.printf(">>>Student %d's marks for subject %d was updated to %d%n", studentID, subjectID, marks);
                    
                }else{
                    System.out.println(">>>Invalid Input Values");
                }
            } else if (firstWord.equals("AVERAGE") && command.split(" ").length==2) {
                int total = 0;
                for (int i = 0; i < nofSubjects; i++) {
                    total += studentMarks[studentID - 1][i];
                }
                double avg = (double) total / nofSubjects;
                System.out.printf(">>>Average for the student %d is %.2f%n", studentID, avg);
            } else if (firstWord.equals("AVERAGE_S") && command.split(" ").length==2) {
                int subjectID = Integer.valueOf(command.split(" ")[1]);
                int total = 0;
                for(int i = 0 ; i < nOfStudents ; i++){
                    total+= studentMarks[i][subjectID-1];
                }
                double avg_s = (double)total/nOfStudents;
                System.out.printf(">>>Average for the subject ID %d is %.2f%n", subjectID,avg_s);
            }else if(firstWord.equals("TOTAL") && command.split(" ").length==2){
                int total = 0;
                for (int i = 0; i < nofSubjects; i++) {
                    total += studentMarks[studentID - 1][i];
                }
                System.out.printf(">>>Total marks for the student %d : %d",studentID,total);
            }else if(firstWord.equals("QUIT")){
                break;
            }else if(firstWord.equals("GRADES")){

                System.out.print("\t\t");
                for(int z = 0 ; z < nofSubjects ; z++){
                    System.out.printf("Subject #%d\t", z + 1);
                }
                System.out.println();
            

                for(int i = 0 ; i < nOfStudents ; i++){
                    System.out.printf("Student #%d\t", i + 1);
                    for(int j = 0 ; j < nofSubjects ; j++){
                        String grade = "";
                        int marks = studentMarks[i][j];
                        if (marks >= 90 && marks <= 100) {
                            grade = "Grade A";
                        } else if(marks >= 80 && marks <= 89){
                            grade = "Grade B";
                        } else if(marks >= 70 && marks <= 79){
                            grade = "Grade C";
                        } else if(marks >= 60 && marks <= 69){
                            grade = "Grade D";
                        } else if(marks >= 1 && marks <= 60){
                            grade = "Fail";
                        } else if(marks == 0){
                            grade = "-";
                        }
                        System.out.printf("%-18s", grade);
                    }
                    System.out.println();
                }
            }
            
            else{
                System.out.println(">>>Incorrect Command , Check again.");
            }
            
        }

    }
}

