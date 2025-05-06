package week10;

public class Student21{
  String nim, name, className;
  int grade;

  public Student21(){

  }

  public Student21(String name, String nim, String className){
    this.nim = nim;
    this.name = name;
    this.className = className;
    this.grade = -1;
  }

  public void gradding(int grade){
    this.grade = grade;
  }
}