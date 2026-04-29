public class Binary{
    static boolean find(String a[],String t){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m].equals(t)) return true;
            else if(a[m].compareTo(t)<0) l=m+1;
            else r=m-1;
        }
        return false;
    }
}