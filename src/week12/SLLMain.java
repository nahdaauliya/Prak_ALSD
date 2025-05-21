package week12;

import java.util.Scanner;
public class SLLMain{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    SingleLinkedList21 sll = new SingleLinkedList21();
    String choice;
    do { 
      System.out.print("Apakah mau lanjut?(y/n): ");
      choice = sc.nextLine();

      if (choice.equalsIgnoreCase("y")){
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n ; i++){
          System.out.println("Data Mahasiswa ke-" +(i+1));
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Name: ");
          String name = sc.nextLine();
          System.out.print("Class Name: ");
          String className = sc.nextLine();
          System.out.print("GPA: ");
          double gpa = sc.nextDouble();
          sc.nextLine();

          Student21 std = new Student21(nim, name, className, gpa);
          sll.addLast(std);
        }
      } else if (choice.equalsIgnoreCase("n")){
        sll.print();
        System.out.println("Data at index 1 is: ");
        Student21 data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        System.out.println("Thank you for using our program!");
      } else{
        System.out.println("Invalid choice!! Please enter 'y' or 'n");
      }
    } while (!choice.equalsIgnoreCase("n"));

    
  }
}