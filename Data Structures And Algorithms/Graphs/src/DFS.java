import java.util.*;

public class DFS {
    public static void main(String[] args) {
        //        for storing graphs we have two ways - adjacency matrix, adjacency list
//        1. Adjacency List
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of nodes/vertices
        int m = in.nextInt(); // no. of edges

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

//        we are adding n+1 ArrayList to list
//        list = [[],[],[],...]
//        in this list at each index we are storing the index node's adjacent nodes
        for(int i=0;i<=n;i++) {
            list.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++) {
            int u = in.nextInt();
            int v = in.nextInt();

            list.get(u).add(v);
            list.get(v).add(u); // remove this if it is a directed graph
        }
//      Adjacency List
        for(ArrayList<Integer> l: list) {
            System.out.println(l);
        }
//        DFS Traversal
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[n+1];
        dfs(1,list,res,vis);
        System.out.println(res);
    }

    static void dfs(int node, ArrayList<ArrayList<Integer>> l,ArrayList<Integer> res,boolean[] vis) {

        vis[node] = true;
        res.add(node);

        for(Integer num: l.get(node)) {
            if(!vis[num]) {
                dfs(num,l,res,vis);
            }
        }
    }
}
