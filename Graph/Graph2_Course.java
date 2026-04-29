import java.util.*;
public class Graph2_Course{
    int v;
    ArrayList<ArrayList<Integer>> adj;
    Graph2_Course(int v){
        this.v=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
    }
    void addEdge(int u,int v){
        adj.get(u).add(v);
    }
}