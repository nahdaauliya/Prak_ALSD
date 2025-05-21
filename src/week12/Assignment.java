package week12;

public class Assignment{
  String nim, name, major, className;

  public Assignment(){

  }

  public Assignment(String nim, String name, String major, String className){
    this.nim = nim;
    this.name = name;
    this.major = major;
    this.className = className;
  }

  void print(){
    System.out.println(nim + " - " + name + " - "+ major+ " - " +className+ " - ");
  }
}