public class Quick{
    static int part(int a[],int l,int r){
        int p=a[r],i=l-1;
        for(int j=l;j<r;j++){
            if(a[j]<p){
                i++;
                int t=a[i];a[i]=a[j];a[j]=t;
            }
        }
        int t=a[i+1];a[i+1]=a[r];a[r]=t;
        return i+1;
    }
    static void sort(int a[],int l,int r){
        if(l<r){
            int pi=part(a,l,r);
            sort(a,l,pi-1);
            sort(a,pi+1,r);
        }
    }
}