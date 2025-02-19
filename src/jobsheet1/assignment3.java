package jobsheet1;
import java.util.Scanner;
public class assignment3 {
    static String[] courseNames;
    static int [] creditHours;
    static int [] semester;
    static String [] lectureDay;
    static int n;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");  
        n = sc.nextInt();
        sc.nextLine();

        courseNames = new String[n];
        creditHours = new int[n];
        semester = new int[n];
        lectureDay = new String[n];

        for (int i = 0; i < n; i++){
            System.out.println("========================================================================================================================================");
            System.out.print("Input the course name: ");
            courseNames[i] = sc.nextLine();

            System.out.print("Input the Credit Hours(SKS):");
            creditHours[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Input the semester:");
            semester[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Input the lecture day (Monday, Tuesday, etc): ");
            lectureDay[i] = sc.nextLine();

        }

        do { 
            System.out.println("========================================================================================================================================");
            System.out.println("Menu: ");
            System.out.println("1. Display Course Schedule");
            System.out.println("2. Search For a Course");
            System.out.print("Choose the number: ");
            int choose = sc.nextInt();
            sc.nextLine();
                switch(choose){
                    case 1: 
                        displayCourse(sc);
                        break;
                    case 2: 
                        searchCourse(sc);
                        break;
                    default:
                        System.out.println("Please enter the true number of choice");
                }

                System.out.println("====================================================================================");
                System.out.print("Apakah anda ingin menghitung lagi? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));

    }
    static void displayCourse(Scanner sc){
        System.out.println("========================================================================================================================================");
        System.out.println("========================================================================================================================================");
        System.out.println("Menu:");
        System.out.println("1. Display All Courses");
        System.out.println("2. Display Courses Schedule on a Specific Day");
        System.out.println("3. Display Courses For a Specific Semester");
        System.out.print("Coose the number: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                displayAllCourses();
                break;
            case 2:
                displayCourseOnSpecificDay(sc);
                break;
            case 3:
                displayCourseForSpecificSemester(sc);
                break;
            default:
                System.out.println("Please enter the true number of choice");
        }

       
    }
    static void searchCourse(Scanner sc){
        System.out.println("========================================================================================================================================");
        System.out.print("Enter the Course want to search for: ");
        String course = sc.nextLine();

        System.out.printf("%-40s %30s %30s %20s\n", "Course Name", "Credit Hours", "Semester", "Lecture Day");
        boolean found = false;
        for(int i = 0; i < courseNames.length; i++){
            if (courseNames[i].equalsIgnoreCase(course)){
                System.out.printf("%-40s %25s %32s %20s\n", courseNames[i], creditHours[i], semester[i], lectureDay[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Course not found");
        }
    }
    static void displayAllCourses(){
        System.out.println("========================================================================================================================================");
        System.out.printf("%-40s %30s %30s %20s\n", "Course Name", "Credit Hours", "Semester", "Lecture Day");
        System.out.println("========================================================================================================================================");
        for(int i = 0; i < n; i++){
            System.out.printf("%-40s %25s %32s %20s\n", courseNames[i], creditHours[i], semester[i], lectureDay[i]);
        }
    }

    static void displayCourseOnSpecificDay(Scanner sc){
        
        System.out.println("========================================================================================================================================");
        System.out.print("Enter the day want to search for: ");
        String day = sc.nextLine();

        System.out.printf("%-40s %30s %30s %20s\n", "Course Name", "Credit Hours", "Semester", "Lecture Day");
        boolean found = false;
        for(int i = 0; i < lectureDay.length; i++){
            if (lectureDay[i].equalsIgnoreCase(day)){
                System.out.printf("%-40s %25s %32s %20s\n", courseNames[i], creditHours[i], semester[i], lectureDay[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Day not found");
        }
    }

    static void displayCourseForSpecificSemester(Scanner sc){
        System.out.println("========================================================================================================================================");
        System.out.print("Enter the semester you want to search for: ");
        int sems = sc.nextInt();
        sc.nextLine();

        System.out.printf("%-40s %30s %30s %20s\n", "Course Name", "Credit Hours", "Semester", "Lecture Day");
        boolean found = false;
        for(int i = 0; i < semester.length; i++){
            if (semester[i] == sems){
                System.out.printf("%-40s %25s %32s %20s\n", courseNames[i], creditHours[i], semester[i], lectureDay[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Semester not found");
        }
    }
    
    
}
