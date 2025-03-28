package week6;

import java.util.Scanner;
public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lecturer: ");
        int n = sc.nextInt();

        LecturerData21 dsn = new LecturerData21(n);

        while(true){
            System.out.println("Menu: ");
            System.out.println("1. Add Lecturer Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC");
            System.out.println("4. Sort DSC");
            System.out.println("5. Search Lecturer Data by Name");
            System.out.println("6. Search Lecturer by Age");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: 
                    for (int i = 0; i < n; i++){
                        System.out.println("Lecturer "+(i+1));
                        System.out.println("==========================================================================");
                        System.out.print("NIDN: ");
                        String id = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Gender ('true' for Male / 'false' for female): ");
                        boolean gender = sc.nextBoolean();
                        sc.nextLine();
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        dsn.addLecturer(new Lecturer21(id, name, gender, age));
                    }
                    break;
                case 2: 
                    dsn.print();
                    break;
                case 3:
                    dsn.sortASC();
                    System.out.println("Sorted Lecturer list(by age, ascending)");
                    dsn.print();
                    break;
                case 4:
                    dsn.sortDSC();
                    System.out.println("Sorted Lecturer list (by age, descending)");
                    dsn.print();
                    break;
                case 5: 
                    System.out.println("Search Lecturer Data by Name");
                    System.out.print("Input the name of the lecturer you want to search for: ");
                    String search = sc.nextLine();
                    dsn.printSeqSearcResult(search);
                    break;
                case 6: 
                    System.out.println("Search Lecturer Data by Age");
                    System.out.print("Input the age of the lecturer you want to search for: ");
                    int search2 = sc.nextInt();
                    dsn.printBinarySearchResult(search2);
                    break;
                case 7: 
                    System.out.println("Thank you for using our program.");
                    return;
                default:
                    System.out.println("Wrong number. Please input the correct number!");
            }
        }



    }
}
