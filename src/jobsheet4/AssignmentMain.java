package jobsheet4;

import java.util.Scanner;   

public class AssignmentMain {
    static Assignmentt[] assignmentArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of student: ");
        int n = sc.nextInt();
        assignmentArray = new Assignmentt[n];

        for (int i = 0; i < n; i++){
            assignmentArray[i] = new Assignmentt();
            System.out.println("Student " + (i+1));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Id Number: ");
            String id = sc.nextLine();
            System.out.print("Year of Admission: ");
            int year = sc.nextInt();
            System.out.print("Midterm Score: ");
            int midterm = sc.nextInt();
            System.out.print("Final Score: ");
            int finall = sc.nextInt();

            assignmentArray[i] = new Assignmentt(name, id, year, midterm, finall);
        }

        do{
            System.out.println("===================================");
            System.out.println("MENU: ");
            System.out.println("1. Display all student data");
            System.out.println("2. Find The Highest Midterm Score(UTS) Using the Devide and Conquer Approach");
            System.out.println("3. Find The Lowest Midterm Score(UTS) Using the Devide and Conquer Approach");
            System.out.println("4. Calculate The Average Final Score(UAS) Of All Students Using The Brute Force Approach");
            System.out.print("Choose Number Of Menu: ");
            int menu = sc.nextInt();
            System.out.println("===================================");

            switch (menu) {
                case 1:
                    AssignmentData.showAllData(assignmentArray);
                    break;
                case 2:
                    Assignmentt highestMidtermStudent = AssignmentData.findMax(assignmentArray, 0, assignmentArray.length - 1);
                    System.out.println("Student with the Highest Midterm Score(UTS): ");
                    System.out.println("Name: " + highestMidtermStudent.name);
                    System.out.println("Id Number: " + highestMidtermStudent.studentID);
                    System.out.println("Year of Admission: " + highestMidtermStudent.yearOfAdmission);
                    System.out.println("Midterm Score: " + highestMidtermStudent.midtermScore);
                    break;
                case 3:
                   Assignmentt lowestMidtermStudent = AssignmentData.findMin(assignmentArray, 0, assignmentArray.length - 1);
                   System.out.println("Student with the Lowest Midterm Score(UTS): ");
                   System.out.println("Name: "+ lowestMidtermStudent.name);
                   System.out.println("Id Number: " + lowestMidtermStudent.studentID);
                   System.out.println("Year of Admission: " + lowestMidtermStudent.yearOfAdmission);
                   System.out.println("Midterm Score: " + lowestMidtermStudent.midtermScore);
                    break;

                case 4: 
                    double averageFinalScore = AssignmentData.calculateAverageFinalScore(assignmentArray);
                    System.out.println("The Average Final Score(UAS) of All Students is: " + averageFinalScore);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
                }
            System.out.print("Do you want to continue? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));
    }
}
