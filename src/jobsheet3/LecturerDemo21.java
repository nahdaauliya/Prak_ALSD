package jobsheet3;

import java.util.Scanner;

public class LecturerDemo21 {
        static Lecturer21[] lecturerArray;
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of lecturer: ");
                int n = sc.nextInt();

                lecturerArray = new Lecturer21[n];

                for(int i = 0; i < n; i++){
                        lecturerArray[i] = new Lecturer21();
                        System.out.println("==============================================================");
                        System.out.println("Lecturer "+ (i+ 1));
                        sc.nextLine();
                        System.out.print("Enter ID number: ");
                        String idNumber = sc.nextLine();
                        System.out.print("Enter name of lecturer "+ (i+1) + ": ");
                        String name = sc.nextLine();
                        System.out.print("Enter gender(true for male/ false for female): ");
                        Boolean gender = sc.nextBoolean();
                        

                        System.out.print("Enter age: ");
                        int age = sc.nextInt();

                        lecturerArray[i] = new Lecturer21(idNumber, name, gender, age); 
                }

                

                do { 
                    System.out.println("==============================================================");
                    System.out.println("MENU:");
                    System.out.println("1. Show All Lecturer Data");
                    System.out.println("2. Count Lecturer By Gender");
                    System.out.println("3. Average Lecturer Age By Gender");
                    System.out.println("4. Show Oldest Lecturer Info");
                    System.out.println("5. Show Youngest Lecturer Info");
                    System.out.print("Choose number of menu: ");
                    int choice = sc.nextInt();


                    switch (choice) {
                        case 1 :
                            LecturerData21.showAllLecturerData(lecturerArray);
                            break;
                        case 2:
                                LecturerData21.countLecturerByGender(lecturerArray);
                                break;
                        case 3:
                                LecturerData21.averageLecturerAgeByGender(lecturerArray);
                                break;
                        case 4: 
                                LecturerData21.showOldestLecturerInfo(lecturerArray);
                                break;
                        case 5: 
                                LecturerData21.showYoungestLecturerInfo(lecturerArray);
                                break;
                        default:
                            System.out.println("Unvalid number. Please enter the true number!");
                    }
                    System.out.print("Do you want to continue? (y/n): ");
                } while (sc.next().equalsIgnoreCase("y"));
                
        }
    
}
