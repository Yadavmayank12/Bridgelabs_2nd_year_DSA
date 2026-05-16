import java.util.*;
public class Graph1_SocialNetwork{
    int v;
    ArrayList<ArrayList<Integer>> adj;
    Graph1_SocialNetwork(int v){
        this.v=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void friends(int u){
        for(int x:adj.get(u))
            System.out.print(x+" ");
    }
    boolean isConnected(int u,int v){
        return adj.get(u).contains(v);
    }
}