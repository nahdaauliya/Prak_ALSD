package jobsheet2;

public class LecturerMain21 {
    public static void main(String[] args){
        Lecturer21 Lecturer1 = new Lecturer21();
        System.out.println();

        Lecturer21 Lecturer2 = new Lecturer21();
        Lecturer2.lecturerID = "235423435665";
        Lecturer2.name = "Dr.Muhammad Archen Aydin";
        Lecturer2.status = true;
        Lecturer2.startYear = 2021;
        Lecturer2.expertiseField = "Computer Science";
        Lecturer2.print(); 
        int tenure2 = Lecturer2.calculateTenure(2025);
        

        Lecturer21 Lecturer3 = new Lecturer21("24244389457", "Prof. Natachai", false, 2019, "Mathematics");
        Lecturer3.print();
        int ternure3 = Lecturer3.calculateTenure(2025);
    }
}
