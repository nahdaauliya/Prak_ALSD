import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus(cm): ");
        int sisi = sc.nextInt();
        do {
            System.out.println("====================================================================================");
            System.out.println("Menu: ");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.print("Masukan pilihan: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    volumeKubus(sc, sisi);;
                    break;
                case 2:
                    luasPermukaanKubus(sc, sisi);
                    break;
                case 3:
                    kelilingKubus(sc, sisi);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
            System.out.println("====================================================================================");
            System.out.print("Apakah anda ingin menghitung lagi? (y/n): ");
        } while (sc.next().equalsIgnoreCase("y"));

    }
    static void volumeKubus(Scanner sc, int sisi){
        System.out.println("====================================================================================");
        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus: " + volume + " cm^3");
    }
    static void luasPermukaanKubus(Scanner sc, int sisi){
        System.out.println("====================================================================================");
        int luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus: " + luasPermukaan + " cm^2");
    }
    static void kelilingKubus(Scanner sc, int sisi){
        System.out.println("====================================================================================");
        int keliling = 12 * sisi;
        System.out.println("Keliling kubus: " + keliling + " cm");
    }
}
