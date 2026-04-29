public class MyMap{
static class Node{
int k,v;Node next;
Node(int k,int v){this.k=k;this.v=v;}
}
Node[]b=new Node[100];

void put(int k,int v){
int i=k%100;
Node cur=b[i];
while(cur!=null){
if(cur.k==k){cur.v=v;return;}
cur=cur.next;
}
Node n=new Node(k,v);
n.next=b[i];
b[i]=n;
}

int get(int k){
int i=k%100;
Node cur=b[i];
while(cur!=null){
if(cur.k==k) return cur.v;
cur=cur.next;
}
return -1;
}

void remove(int k){
int i=k%100;
Node cur=b[i],prev=null;
while(cur!=null){
if(cur.k==k){
if(prev==null) b[i]=cur.next;
else prev.next=cur.next;
return;
}
prev=cur;cur=cur.next;
}
}
}