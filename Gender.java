// Program showing use of Switch for welcoming a user.

public class Gender {
    public static void main(String[] args) {
        char gender='f';
        String msg;
        switch (gender) {
            case 'm': msg="Hello Mister";
                break;
            case 'f': msg="Hello Miss";
                break;
            default:
                  msg= "Hello Alien";
            
        }
        System.out.println(msg);
    }
}
