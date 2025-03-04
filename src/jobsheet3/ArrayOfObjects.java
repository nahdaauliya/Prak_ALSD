package jobsheet3;

import java.util.Scanner;
public class ArrayOfObjects {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rectangles:  ");
        int n = sc.nextInt();
        Rectangle[] rectangleArray = new Rectangle[n];

        for(int i = 0; i < n; i++){
            rectangleArray[i] = new Rectangle();
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectangleArray[i].width = sc.nextInt();
        }

        System.out.println("=============================================================================");

        for (int i = 0; i < 10; i++){
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Rectangle " + i);
            System.out.println("Width: " + rectangleArray[0].width + " Length: " + rectangleArray[0].length);
        }

    }
}
