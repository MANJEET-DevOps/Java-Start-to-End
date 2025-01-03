// Here is a short program that computes he  length of he Hypotenuse of a right triangle give the lengths of its two opposing sides: 

public class DynInit {
    public static void main(String[] args) {
       double a=3.0, b=4.0;
        //c is dynamicallly initialized
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Hypotenuse is" +c); 
    }
}
