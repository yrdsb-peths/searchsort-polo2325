package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        if(arr.length == 0) return 0;

        QuickSort quick = new QuickSort();

        quick.sort(arr);

        if((arr.length)%2 == 0) 
        {
            return (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }

        return arr[arr.length/2];
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        if(arr.length == 0) return 0;

        MergeSort mSort = new MergeSort();

        mSort.sort(arr);

        if((arr.length)%2 == 0) 
        {
            return (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }

        return arr[arr.length/2];
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        if(arr.length == 0) return 0;

        InsertionSort.sort(arr);

        if((arr.length)%2 == 0) 
        {
            return (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }

        return arr[arr.length/2];
    }

}
