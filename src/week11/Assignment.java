package week11;

public class Assignment{
     String nim, name, studyProgram, className;
     int semester;

     public Assignment(){

     }

     public Assignment(String nim, String name, String studyProgram, String className, int semester){
        this.nim= nim;
        this.name= name;
        this.className = className;
        this.studyProgram = studyProgram;
        this.semester = semester;
     }
  
     void print(){
        System.out.println(nim + " - " +name+ " - "+studyProgram+" - "+className + " - " + semester); 
     }
}