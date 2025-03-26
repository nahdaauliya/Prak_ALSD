package week7;

public class SearchStudent {
    Students[] listStd = new Students[5];
    int idx;

    public void add(Students std){
        if (idx < listStd.length){
            listStd[idx] = std;
            idx++;
        } else{
            System.out.println("Data is already full");
        }
    }

    public void display(){
        for (Students students : listStd){
            students.display();
            System.out.println("--------------------------------------------------------------");
        }
    }
}
