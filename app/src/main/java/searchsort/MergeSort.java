package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);
    }

    private void mergeSort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) return;

        int mid = (lo + hi) / 2;         

        mergeSort(a, aux, lo, mid);   
        mergeSort(a, aux, mid + 1, hi);  
        merge(a, aux, lo, mid, hi);      
    
    } 

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++)
        {
            aux[k] = arr[k];
        }

        int i = lo; // left side index
        int j = mid + 1; // right side index

        for (int k = lo; k <= hi; k++) { 

            if (i > mid) { 
                arr[k] = aux[j];
                j++;
            } else if (j > hi) {
                arr[k] = aux[i];
                i++;
            } else if (aux[j] < aux[i]) { 
                arr[k] = aux[j];
                j++;
            } else { 
                arr[k] = aux[i];
                i++;
            }
            
        }
    }
}