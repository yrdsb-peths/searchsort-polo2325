package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        
        int smallest;
    
        for (int i = 0; i < arr.length-1; i++) {
            smallest = i;

            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[smallest]) smallest = j;
            }
            
            Util.exch(arr, i, smallest);
        }
    }
}
