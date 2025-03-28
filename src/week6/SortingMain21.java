package week6;

public class SortingMain21 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int [] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting21 sorting = new Sorting21(a);
        System.out.println("Original array: ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort): ");
        sorting.print();

        Sorting21 sorting2 = new Sorting21(b);
        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted arrat (Selection Sort): ");
        sorting2.print();

        Sorting21 sorting3 = new Sorting21(c);
        System.out.println("Original array");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array(insertion Sort):");
        sorting3.print();
    }
    
}
