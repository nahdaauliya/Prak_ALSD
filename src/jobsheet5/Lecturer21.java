package jobsheet5;

public class Lecturer21 {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer21(){

    }
    
    public Lecturer21(String id, String name, boolean gender, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print(){
        System.out.println("NIDN: "+id);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+(gender ? "Male" : "Female"));
        System.out.println("Age: "+age);
        System.out.println("=====================================================================");
    }
}
