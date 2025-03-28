package week6;

public class LecturerData21 {
    Lecturer21[] lecturerData;
    int idx;

    public LecturerData21(int size){
        lecturerData = new Lecturer21[size];
        idx = 0;
    }

    public void addLecturer(Lecturer21 lecturer){
        if (idx < lecturerData.length){
            lecturerData[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print(){
        if (idx == 0){
            System.out.println("No lecturer data available.");
            return;
        }

        System.out.println("\n============================================================================================================================");
        System.out.printf("%-30s %30s %30s %20s\n", "ID", "Name", "Gender", "Age");
        System.out.println("\n============================================================================================================================");

        for (int i = 0; i < idx; i++){
            Lecturer21 d = lecturerData[i];
            System.out.printf("%-30s %30s %30s %20s\n", d.id, d.name, (d.gender ? "Male" : "Female"), d.age);
        }
        System.out.println("\n============================================================================================================================");

    }

    public void sortASC(){
        for (int i = 0; i < idx -1; i++){
            for(int j = 0; j < idx -i-1; j++){
                if (lecturerData[j].age > lecturerData[j+1].age){
                    Lecturer21 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j+1];
                    lecturerData[j+1] = temp;
                }
            }
        }
    }

    public void sortDSC(){
        for (int i = 0; i < idx -1; i++){
            int maxIndex = i;
            for (int j = i+1; j < idx; j++){
                if (lecturerData[j].age > lecturerData[maxIndex].age){
                   maxIndex = j; 
                }
            }
            Lecturer21 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }

    public String findSeqSearch(String search){
        for (int i = 0; i < lecturerData.length; i++){
            if (lecturerData[i].name.equals(search)){
                return "Found at index " + i;
            }
        }
        return "not found";
    }

    public int findBinarySearch(int cari, int left,int right){
        int mid;
        if (right >= left){
            mid = (left + right)/2;
            if (cari == lecturerData[mid].age){
                return(mid);
            } else if (lecturerData[mid].age > cari){
                return findBinarySearch(cari, left, mid -1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void printSeqSearcResult(String search){

        for (int i=0; i < idx; i++){
            if (lecturerData[i].name.equalsIgnoreCase(search)){
                System.out.println("Lecturer found: ");
                System.out.println("========================================================");
                System.out.println("NIDN: "+ lecturerData[i].id);
                System.out.println("Name: " + lecturerData[i].name);
                System.out.println("Gender: " +(lecturerData[i].gender? "Male": "Female"));
                System.out.println("Age: " +lecturerData[i].age);
                System.out.println("========================================================");
            }
        }
    }
    
    public void printBinarySearchResult(int age){
        sortASC();
        int result = findBinarySearch(age, 0, idx - 1);
        if (result != -1){
            System.out.println("Lecturer found");
            System.out.println("===============================================================");
            System.out.println("NIDN: " +lecturerData[result].id);
            System.out.println("Name: " + lecturerData[result].name);
            System.out.println("Gender: "+ (lecturerData[result].gender? "Male": "Female"));
            System.out.println("Age: " + lecturerData[result].age);
            System.out.println("================================================================");
        } else{
            System.out.println("Not found");
        }
    }
}
