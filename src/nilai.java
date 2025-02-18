import java.util.Scanner;

public class nilai{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nilaiHuruf = "";
        double nilaiAkhir = 0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");

        System.out.print("Masukan Nilai Tugas: ");
        int tugas = sc.nextInt();

        System.out.print("Masukan Nilai Kuis: ");
        int kuis = sc.nextInt();

        System.out.print("Masukan Nilai UTS: ");
        int uts = sc.nextInt();

        System.out.print("Masukan Nilai UAS: ");
        int uas = sc.nextInt();
        System.out.println("==================================");
        System.out.println("==================================");

            if ((tugas > 100 || tugas < 0)  || (kuis > 100 || kuis < 0) || (uts > 100 || uts < 0) || (uas > 100 || uas < 0)){
                System.out.println("Nilai tidak valid");
                System.out.println("==================================");
            } else{  
                nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
                System.out.println("Final Grade: " + nilaiAkhir);
                if (nilaiAkhir > 80 && nilaiAkhir <= 100){
                    nilaiHuruf = "A";
                } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
                    nilaiHuruf = "B+";
                } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
                    nilaiHuruf = "B";
                } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
                    nilaiHuruf = "C+";
                } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
                    nilaiHuruf = "C";
                } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
                    nilaiHuruf = "D";
                } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39){
                    nilaiHuruf = "E";
                } else{
                    System.out.println("Nilai tidak valid");
                } 
            }
            System.out.println("Grade: " + nilaiHuruf);

            System.out.println("==================================");
            System.out.println("==================================");

            if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C"){
                System.out.println("Selamat Anda Lulus");
            } else {
                System.out.println("Maaf Anda Tidak Lulus");
            }
            
        }
}