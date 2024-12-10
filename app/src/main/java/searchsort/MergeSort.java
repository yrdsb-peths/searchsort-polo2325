package searchsort;
public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        // Plan:
        // 1. divide the array into two halves
        // 2. sort the left half
        // 3. sort the right half
        // 4. merge the two halves

        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length - 1);

    }

    private void mergeSort(int[] a, int[] aux, int lo, int hi) {
        // Array is sorted if lo is greater than hi
        if (lo >= hi)
            return;
        int mid = (lo + hi) / 2; // index of middle element
        mergeSort(a, aux, lo, mid); // Sort left side of array
        mergeSort(a, aux, mid + 1, hi); // Sort right side of array
        merge(a, aux, lo, mid, hi); // Combine both halves
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) // copy
            aux[k] = arr[k];
        int i = lo; // left side index
        int j = mid + 1; // right side index
        for (int k = lo; k <= hi; k++) { // merge
            if (i > mid) { // left is exhausted
                arr[k] = aux[j];
                j++;
            } else if (j > hi) { // right is exhausted
                arr[k] = aux[i];
                i++;
            } else if (aux[j] < aux[i]) { // right element smaller than left
                arr[k] = aux[j];
                j++;
            } else { // left element smaller than right
                arr[k] = aux[i];
                i++;
            }
        }
    }
}