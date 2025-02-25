package jobsheet2;

public class CourseMain21 {
    public static void main(String[] args){
        System.out.println();
        Course21 course1 = new Course21();
        System.out.println("Course 1");
        System.out.println();

        Course21 course2 = new Course21();
        course2.courseID = "CSC-102";
        course2.name = "Introduction to Computer Science";
        course2.credit = 4;
        course2.hour = 4;   
        course2.print();
        course2.addHour(2);

        Course21 course3 = new Course21("CSC-103", "Data Structure and Algorithm", 4, 4);
        course3.print();

        
    }
}
