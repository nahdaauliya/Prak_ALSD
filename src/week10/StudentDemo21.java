package week10;

import java.util.Scanner;
public class StudentDemo21{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StudentAssignmentStack21 stack = new StudentAssignmentStack21(5);

    int choice;
    do{
      System.out.println("\nMenu: ");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Tugas Terbawah");
      System.out.println("5. Melihat Daftar Tugas");
      System.out.println("6. Menghitung Tugas yang terkumpul");
      System.out.println("0. Keluar");
      System.out.print("Pilih: ");
      choice = sc.nextInt();
      sc.nextLine();
  
      switch(choice){
        case 1:
          System.out.print("Nama: ");
          String name = sc.nextLine();
          System.out.print("NIM: ");
          String nim = sc.nextLine();
          System.out.print("Kelas: ");
          String kelas = sc.nextLine();
          Student21 mhs = new Student21(name, nim, kelas);
          stack.push(mhs);
          System.out.printf("Tugas %s berhasil dikumpulkan\n:)", mhs.name);
          break;
        case 2: 
          Student21 dinilai = stack.pop();
          if (dinilai != null){
            System.out.println("Menilai tugas dari "+ dinilai.name);
            System.out.print("Masukkan nilai (0-100): ");
            int nilai = sc.nextInt();
            dinilai.gradding(nilai);
            System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);

            String binary = stack.convertToBinary(nilai);
            System.out.printf("Assignment gradde in binary is %s\n", binary);
          }
          break;

        case 3:
          Student21 lihat = stack.peek();
          if (lihat != null){
            System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
          }
          break;

        case 4:
          Student21 bawah = stack.lihatTerbawah();
          if (bawah != null){
            System.out.println("Tugas Pertama dikumpulkan oleh " + bawah.name);
          }
          break;
        
        case 5: 
          System.out.println("Daftar semua tugas");
          System.out.println("Nama\tNIM\tKelas");
          stack.print();
          break;

        case 6: 
          System.out.println("Jumlah tugas yang terkumpul: " + stack.hitungTugas());
          break;
        
        case 0: 
          System.out.println("Terima kasih telah menggunakan program kami");
          return;

        default:
          System.out.println("Pilihan tidak valid.");
      }
    }while(choice >= 0 && choice <= 6);
  }    
}