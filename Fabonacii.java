// Program to print first 6 number of a fabonacii series

public class Fabonacii {
    public static void main(String[] args) {
        int first=1,second=2;
        int temp;
        // Print 1 and 2 as they are he staring values
        System.out.println(first);
        System.out.println(second);
        for(int i=0; i<=6; i++){
            temp=second;
            second=first+second;
            first=temp;
            System.out.println(second);
        } 
        System.out.println("\n");
    }
}
