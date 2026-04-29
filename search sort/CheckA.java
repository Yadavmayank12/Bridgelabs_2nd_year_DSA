public class CheckA{
    static boolean ok(int a[],int b[]){
        for(int i=0;i<b.length;i++){
            boolean f=false;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){f=true;break;}
            }
            if(!f) return false;
        }
        return true;
    }
}