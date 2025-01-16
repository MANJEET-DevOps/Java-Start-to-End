// Program to find maximum value and is index position in array

public class FindMAX {
    public static void main(String[] args) {
        int a[]={12,32,75,8,182,946,234,234,123,234,76};
        int max=a[0],pos=0;

        for(int i=1;i<=a.length-1;i++){
            if(max>a[i]){
                continue;
            }
            else{
                max=a[i];
                pos=i;
            }
        }
        System.out.println("Max Value is " +max+ " at position "+pos);
    }
}
