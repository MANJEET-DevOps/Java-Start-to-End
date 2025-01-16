// Program to find binary equivalent of a decimal value

public class Dec {
    public static void main(String[] args) {
        int index =0;
        int dec=132;
        int d[]=new int[8];
        for(int i=dec; i>=1;){
            // Store each bit in array
            d[index]=i%2;
            index++;
            i=i/2;
        }
        System.out.println("The binary of "+dec+" is=");
        // Print he array in reverse fashion
        for(int i=index-1; i>=0; i--){
            System.out.println(d[i]);
        }
        System.out.println("\n");
    }
}
