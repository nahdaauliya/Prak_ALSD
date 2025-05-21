package week12;

public class Student21{
    String nim, name, className;
    double gpa;

    public Student21() {

    }

    public Student21(String nim, String name,String className, double ip) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    } 
}