package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0; j--) {

                if(arr[j] < arr[j-1]) {
                    Util.exch(arr, j, j-1);
                } else {
                    break;
                }
            }


        }
    }
}
