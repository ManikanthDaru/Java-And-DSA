public class Selection_Sort {
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
        selectionSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    //    selection sort
    static void selectionSort(int[] arr, int n) {

        for(int i=0;i<n-1;i++) {

            int min_i = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[min_i]) {
                    min_i = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = temp;
        }
    }
}
