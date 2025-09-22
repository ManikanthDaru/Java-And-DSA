public class Insertion_Sort {
    // Function to print an array
    static void printArray(int[] arr, int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String[] args){
        int[] arr = {5,1,6,3};
        int n = arr.length;
        insertionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    //    insertion sort
    static void insertionSort(int[] arr, int n) {

        for(int i=1;i<n;i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
