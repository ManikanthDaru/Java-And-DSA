import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        //        for storing graphs we have two ways - adjacency matrix, adjacency list
//        2. Adjacency List - Space used - O(2*E)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of nodes/vertices
        int m = in.nextInt(); // no. of edges

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

//        we are adding n+1 ArrayList to list
//        list = [[],[],[],...]
//        in this list at each index we are storing the index node's adjacent nodes
        for(int i=0;i<=n;i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            list.get(u).add(v); // add (v,w) as a pair if the graph is weighted
            list.get(v).add(u); // remove this if it is a directed graph
        }

        for(ArrayList<Integer> l: list) {
            System.out.println(l);
        }
    }
}
