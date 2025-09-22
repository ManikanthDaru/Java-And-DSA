public class Bubble_Sort {
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
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

//    bubble sort
    static void bubbleSort(int[] arr, int n) {

        for(int i=0;i<n-1;i++) {
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
