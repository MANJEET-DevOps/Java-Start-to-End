// Write some programs showing Java's Variable Declaration and use of literals. 

public class TestVar {
    public static void main(String[] args) {
        int a; //Declaring an int type variable that store
                    //int type of data
        char c; // Declaring an char type variable that store
                    // char type of data
        float f; //Declaring an float type variable that store
                    // float type of data
        a=10;
        c='a';
        f=10.2f;
          System.out.println(a+","+c+","+f);
        a=20;
        c='b';
        f=13.2f;
          System.out.println(a+","+c+","+f);
        ++a;
        ++c;    // Integer value of char 'b' is incremeted by 1
        ++f; 
        System.out.println(a+","+c+","+f);
    }
}
