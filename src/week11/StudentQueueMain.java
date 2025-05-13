package week11;

import java.util.Scanner;
public class StudentQueueMain{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StudentQueue queue = new StudentQueue(5);
    int choice;
    int count = 0;
    do { 
      System.out.println("\n=== Academic Service Menu ===");
      System.out.println("1. Enqueue Student");
      System.out.println("2. Dequeue Student");
      System.out.println("3. Display Front");
      System.out.println("4. Display All Data");
      System.out.println("5. Queue Size");
      System.out.println("6. Check Rear of The Queue");
      System.out.println("0. Exit");
      System.out.print("Choose a menu: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
          case 1: 
            System.out.print("NIM: ");
            String nim= sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Study Program: ");
            String studyProgram = sc.nextLine();
            System.out.print("Class Name: ");
            String className = sc.nextLine();

            Student student = new Student (nim, name, studyProgram, className);
            queue.enqueue(student);
            break;

          case 2:
            Student studentBeingServed = queue.dequeue();
            if (studentBeingServed != null){
              System.out.println("Student being served: ");
              studentBeingServed.print();
              count++;
              System.out.println("Total students served: " + count);
            }
              break;

          case 3: 
            queue.peek();
            break;
          
          case 4:
            queue.print();
            break;
          case 5:
            System.out.println("Queue size: " +queue.size);  
            break;

          case 6:
            queue.displayRear();
          case 0:
            System.out.println("Thank you for using our program!!");
            break;

          default:
            System.out.println("Invalid menu!!");
      }
    } while (choice != 0);
  }
}