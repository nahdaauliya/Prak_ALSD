package jobsheet4;

public class Assignmentt {
    String name;
    String studentID;
    int yearOfAdmission;
    int midtermScore;
    int finalScore;

    public Assignmentt() {
    }

    public Assignmentt(String name, String id, int year, int midterm, int finall){
        this.name = name;
        this.studentID = id;
        this.yearOfAdmission = year;
        this.midtermScore = midterm;
        this.finalScore = finall;
    }
}
