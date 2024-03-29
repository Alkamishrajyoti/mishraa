package practicePrograms;
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        
        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    // Function to perform insertion sort on an array
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Function to print an array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
