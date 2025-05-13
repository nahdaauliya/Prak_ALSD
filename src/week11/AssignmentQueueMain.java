package week11;

import java.util.Scanner;

public class AssignmentQueueMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        AssignmentQueue queue = new AssignmentQueue(10);
        int choice;
        int count = 0;
        do {
            System.out.println("\n=== KRS ===");
            System.out.println("1. Add Student");
            System.out.println("2. Process KRS");
            System.out.println("3. Display The First Two Students");
            System.out.println("4. Display Rear Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Total Number Of Students");
            System.out.println("7. Display The Number Of students Who Have Been Processed");
            System.out.println("8. Display The Number Of Students Who Have Not Been Processed");
            System.out.println("0. Exit");
            System.out.print("Choose Menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: 
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();
                    System.out.print("Semester: ");
                    int semester = sc.nextInt();
                    sc.nextLine();

                    Assignment ass = new Assignment(nim,name,studyProgram, className, semester);
                    queue.enqueue(ass);
                    break;

                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek2();
                    break;
                case 4:
                    queue.displayRear();
                    break;
                case 5:
                    queue.print();
                    break;
                case 6: 
                    System.out.println("Total of students in queue is " + queue.size);
                    break;
                case 7:
                    System.out.println("The number of students who have been processed is " + queue.getApprovedCount());
                    break;
                case 8:
                    System.out.println("The number of students who haven't been processed is " + queue.getRemainingQuota());
                    break;
                case 0:
                    System.out.println("Thanks for choosing our program");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 0);
        sc.close();
    }
  
}