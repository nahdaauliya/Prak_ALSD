package week7;

public class Students {
    int age, nim;
    String name;
    double gpa;

    public Students(){

    }

    public Students(int nim, String name, int age, double gpa){
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void display(){
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " +gpa);
    }
    
}
