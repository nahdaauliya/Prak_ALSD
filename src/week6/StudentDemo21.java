package week6;

import java.util.Scanner;
public class StudentDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the student number: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        TopStudents21 topStudents = new TopStudents21(n);

        for (int i = 0; i < n; i++){
            System.out.println("Student " + (i + 1));
            System.out.println("====================================================================================");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();
            System.out.println("=========================================================================================");

            topStudents.add(new Student21(nim, name, studentClass, gpa));
        }
        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list(by GPA, descending): ");
        topStudents.print();

        topStudents.selcetionSort();
        System.out.println("Sorted student list (by GPA, ascendeding) using Selection Sort: ");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
        topStudents.print();

    }
    
}
