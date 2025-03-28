package week7;

import java.util.Scanner; 

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        SearchStudent data = new SearchStudent();

        System.out.print("Input number of student: ");
        int amaountStudent = s.nextInt();

        System.out.println("========================================================");
        System.out.println("Input student data accordingly from smallest NIM");
        for(int i = 0; i < amaountStudent; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = sl.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students std = new Students(nim, name, age, gpa);
            data.add(std);
        }
        
        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.print("Search student by NIM:");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("===========================================================");
        System.out.println("Search student by NIM: ");
        System.out.println("Using binary search");
        int position1 = data.findBinarySearch(search, 0, amaountStudent -1);

        data.showPosition(search, position1);
        data.showData(search, position1);
    }
    
}
