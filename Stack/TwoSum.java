import java.util.*;
public class TwoSum{
public static void main(String[]args){
int a[]={2,7,11,15},t=9;
HashMap<Integer,Integer>m=new HashMap<>();
for(int i=0;i<a.length;i++){
if(m.containsKey(t-a[i])){
System.out.println(m.get(t-a[i])+" "+i);
return;
}
m.put(a[i],i);
}
}
}