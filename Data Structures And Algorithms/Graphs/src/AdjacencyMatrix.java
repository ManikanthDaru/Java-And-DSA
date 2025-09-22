import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {

//        for storing graphs we have two ways - adjacency matrix, adjacency list
//        1. Adjacency Matrix - Space used - O(N*N)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of nodes/vertices
        int m = in.nextInt(); // no. of edges
        int[][] mat = new int[n+1][n+1]; // adjacency matrix
        for(int[] arr: mat) {
            Arrays.fill(arr,0);
        }
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n;j++) {
//                mat[i][j] = 0;
//            }
//        }

        for(int i=0;i<m;i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            mat[u][v] = 1; // if given weights pass w instead of 1
            mat[v][u] = 1; // remove this if it is a directed graph
        }

        for(int[] arr: mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
