import java.util.Scanner;
public class function {

    static final int priceAglonema = 75000;
    static final int priceKeladi = 50000;
    static final int priceAlocasia = 60000;
    static final int priceMawar = 10000;

    static int[][] flowerStock = new int[4][4];
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < flowerStock.length ; i++){
            System.out.println("===========================================================================");
            System.out.println("RoyalGarden " + (i +1) + ": ");
            System.out.print("Aglonema: ");
            flowerStock[i][0] = sc.nextInt();
            System.out.print("Keladi: ");
            flowerStock[i][1] = sc.nextInt();
            System.out.print("Alocasia: ");
            flowerStock[i][2] = sc.nextInt();
            System.out.print("Mawar: ");
            flowerStock[i][3] = sc.nextInt();
        }
        tampilanPendapatan();
        remainingStock();

    }

    static void tampilanPendapatan(){
        System.out.println("===========================================================================");  
        System.out.println("Tampilan pendapatan jika semua bungan di cabang royal garden terjual habis:");
        System.out.println("===========================================================================");

        for (int i = 0; i < flowerStock.length; i++){
            int totalStock = flowerStock[i][0] * priceAglonema +
                    flowerStock[i][1] * priceKeladi +
                    flowerStock[i][2] * priceAlocasia +
                    flowerStock[i][3] * priceMawar;
                    System.out.println("RoyalGarden " + (i + 1) + ": " + totalStock);
        }
        System.out.println("===========================================================================");
    }

    static void remainingStock(){

        int[] remaining = {1,2,0,5};

        System.out.println("===========================================================================");
        System.out.println("Remaining stock bunga di cabang royal garden 4: ");
        System.out.println("===========================================================================");

        for (int j = 0; j < flowerStock[3].length; j++){
            int totalStock = flowerStock[3][j] - remaining[j];
                    System.out.println("Remaining stock " + (j + 1) + ": " + totalStock);
        }
        System.out.println("===========================================================================");
    }
}
