import java.util.*;
public class ShortestPath{
    void shortestPath(int s,int dest,ArrayList<ArrayList<Integer>> adj){
        int n=adj.size();
        boolean vis[]=new boolean[n];
        int parent[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        parent[s]=-1;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int x:adj.get(node)){
                if(!vis[x]){
                    vis[x]=true;
                    parent[x]=node;
                    q.add(x);
                }
            }
        }
        int cur=dest;
        while(cur!=-1){
            System.out.print(cur+" ");
            cur=parent[cur];
        }
    }
}