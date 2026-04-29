import java.util.*;
public class DFS_BFS{
    void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        System.out.print(node+" ");
        for(int x:adj.get(node)){
            if(!vis[x]) dfs(x,vis,adj);
        }
    }
    void bfs(int s,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[adj.size()];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+" ");
            for(int x:adj.get(node)){
                if(!vis[x]){
                    vis[x]=true;
                    q.add(x);
                }
            }
        }
    }
}