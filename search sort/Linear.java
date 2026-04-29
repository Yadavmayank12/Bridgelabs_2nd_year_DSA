public class Linear{
    static boolean find(String a[],String t){
        for(int i=0;i<a.length;i++)
            if(a[i].equals(t)) return true;
        return false;
    }
}