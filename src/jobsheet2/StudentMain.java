package jobsheet2;

public class StudentMain {
    public static void main(String[] args) {
        Student21 student1 = new Student21();
        student1.studentID= "244107020042";
        student1.name= "Nahda";
        student1.className = "TI-1I";
        student1.gpa = 4.0;
        student1.print();
        student1.changeClass("TI-2I");  
        student1.updateGPA(3.8);
        student1.print();   

        Student21 student2 = new Student21("244107020040", "Archen", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();
        student2.evaluate();

        Student21 student3 = new Student21("244107020032", "Muhammad Archen Aydin", "TI-1I", 3.8);
        student3.print();
    }
}
