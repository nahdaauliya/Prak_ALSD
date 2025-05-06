package week10;

import java.util.Scanner;
public class ExcuseLetterDemo{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of students who gave excuse letters: ");
    int n = sc.nextInt();
    sc.nextLine();
    ExcuseLetterStack21 stack = new ExcuseLetterStack21(n);

    int choice;
    do{
      System.out.println("\nMenu: ");
      System.out.println("1. Add Excuse Letter");
      System.out.println("2. Process Excuse Letter");
      System.out.println("3. View Lastest Excuse Letter");
      System.out.println("4. Search for Letter by Name");
      System.out.println("0. Exit");
      System.out.print("Choose the option: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch(choice){
        case 1:
          if (stack.isFull()){
            System.out.println("Stack is already full!!");
            break;
          }
          System.out.print("Nama: ");
          String name = sc.nextLine();
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Class: ");
          String className = sc.nextLine();
          char type;
          while (true) { 
            System.out.print("Type of Excuse Letter('S' for 'sick' or 'I' for Other reasons): ");
            type = sc.next().charAt(0); 
            if (type == 'S' || type == 's' || type == 'I' || type == 'i'){
              break;
            }else{
              System.out.println("Invalid input!");
            }
          }

          System.out.print("Duration of Excuse Letter: ");
          int duration = sc.nextInt();
          sc.nextLine();
          ExcuseLetter21 letter = new ExcuseLetter21(nim, name, className, type, duration);
          stack.push(letter);
          break;

        case 2:
          ExcuseLetter21 processedLetter = stack.pop();
          if (processedLetter != null){
            System.out.println("Processing Excuse Letter from: "+ processedLetter.name);
            System.out.println("Excuse Letter Type: "+ processedLetter.typeOfExcuse);
            System.out.print("Want to process the letter? (Y/N): ");
            char process = sc.next().charAt(0);
            if (process == 'Y' || process == 'y'){
              System.out.println("Excuse Letter from " + processedLetter.name + " has been processed.");
            }else if (process == 'N' || process == 'n'){
              System.out.println("Excuse Letter from " + processedLetter.name + " has not been processed");
            }
          }
          break;
        
        case 3: 
          ExcuseLetter21 latest = stack.peek();
          if (latest != null){
            System.out.println("Latest Excuse Letter from " + latest.name);
          }
          break;

        case 4: 
          System.out.print("Search for Excuse Letter by Name: ");
          String search = sc.nextLine();
          stack.findSeqSearch(search);
          break;

        case 0:
          System.out.println("Thank you for using the program");
          return;
        
        default:
          System.out.println("Invalid Option!!");
          break;
      }
    }while(choice >= 0);
  }
}