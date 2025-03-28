package week7;

public class SortMain {
    public static void main(String[] args) {
        int[] a = {10, 40, 30, 70, 50, 90, 100, 20};

        MergeSort sorting = new MergeSort();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        sorting.printArray(a);

        sorting.mergeSort(a);

        System.out.println("Sorted Data");
        sorting.printArray(a);
    }
    
}
