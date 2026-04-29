import java.util.*;
public class Pair{
public static void main(String[]args){
int a[]={2,7,11,15},t=9;
HashSet<Integer>s=new HashSet<>();
for(int x:a){
if(s.contains(t-x)){
System.out.println("Yes");
return;
}
s.add(x);
}
System.out.println("No");
}
}