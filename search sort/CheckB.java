import java.util.*;
public class CheckB{
    static boolean ok(int a[],int b[]){
        HashSet<Integer>s=new HashSet<>();
        for(int x:a) s.add(x);
        for(int x:b)
            if(!s.contains(x)) return false;
        return true;
    }
}