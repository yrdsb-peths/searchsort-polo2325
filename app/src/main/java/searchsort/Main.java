package searchsort;

// import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Main class for manually testing your code.
 */
public class Main {
    public static void main(String[] args) {
        // Test Util.exch
        int[] arr1 = { 1, 2, 3, 4, 5 };
        Util.exch(arr1, 0, 1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();

        // int[] arr9 = Util.generateRandomArray(200000, 12345L);
        // m.sort(arr9);
        // for (int i = 0; i < arr9.length; i++) {
        //     System.out.print(arr9[i] + " ");
        // }

        System.out.println();
        int[] arr9 = Util.generateRandomArray(10, 12345L);
        for (int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i] + " ");
        }
        
    }
}
