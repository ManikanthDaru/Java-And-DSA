import java.util.*;

public class BFS {
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
//        BFS Traversal
        ArrayList<Integer> ans = bfs(n,list);
        System.out.println(ans);
    }

    static ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> l) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] vis = new int[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(3);
        vis[3] = 1;

        while(!q.isEmpty()) {
            int node = q.poll();
            res.add(node);

            for(Integer num: l.get(node)) {
                if(vis[num]!=1) {
                    vis[num]=1;
                    q.add(num);
                }
            }
        }

        return res;
    }
}
