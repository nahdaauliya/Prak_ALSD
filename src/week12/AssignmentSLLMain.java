package week12;

import java.util.Scanner;
public class AssignmentSLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AssignmentSLL sll = new AssignmentSLL();
        int choice;
        
        do { 
            System.out.println("");
            System.out.println("=== Student Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. Process Student");
            System.out.println("3. Display All Student");
            System.out.println("4. Display First Student");
            System.out.println("5. Display Last Student");
            System.out.println("6. Clear All Student");
            System.out.println("0. Exit");
            System.out.print("Choose Menu: ");
            choice = sc.nextInt();
            System.out.println("");
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Major:");
                    String major = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();

                    Assignment std =new Assignment(nim, name, major, className);
                    sll.add(std);
                    break;

                case 2: 
                    sll.callNextStudent();
                    break;
                case 3:
                    sll.print();
                    break;
                case 4:
                    sll.peek();
                    break;
                case 5: 
                    sll.displayRear();
                    break;
                case 6:
                    sll.clear();
                    break;
                case 0:
                    System.out.println("Thank you for choosing our program!!");
                    return;
                default:
                    System.out.println("Invalid input! Please input the true menu!");
            }
        } while (choice != 0 && choice <= 6);

    }
}