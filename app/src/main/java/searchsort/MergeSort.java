package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        if(arr.length<=1) {

        }

        // merge()

    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        mergeHelp(arr, )
    }

    void mergeHelp(int[] arr, int[] aux, int lo, int mid, int hi){
     
        for(int k = lo; k <= hi; k++)
            aux[k] = arr[k];
      
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > hi) {
                arr[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }                       
        }
    }   
}
