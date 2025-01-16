// Program to find Max and Min is an arraay

public class FindMAX_MIN {
    public static void main(String[] args) {
        int a[]={40,52,75,65,75,24,64,73,75,71,52,75,65,72,75,24,64,73,75,71};
        int max=a[0];
        int min=a[0];
        int pmax=0;
        int pmin=0;
        for(int i=1;i<=a.length-1;i++){
            if(max<a[i]){
                max=a[i];
                pmax=i;
            }
            if(min>a[i]){
                min=a[i];
                pmin=i;
            }
        }
        System.out.println("MAX=("+max+","+pmax+"), MIN=("+min+","+pmin+")");
    }
}
