// The Statement part of "if" contains another if. 
// This example finds the greatest valued integer in a,b and c.

public class Nested_if {
    public static void main(String[] args) {
        int a=34, b=23, c=332;
        if(a>b)
        {
            if(a>c)
                System.out.println("a is greatest.");
            else
                System.out.println("c is greatest.");
        }
        else
        {
            if(b>c)
                System.out.println("b is greatest.");
            else
                System.out.println("c is greatest.");
        }
    }
}
