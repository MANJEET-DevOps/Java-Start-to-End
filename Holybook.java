// Find my religious book.

public class Holybook {
    public static void main(String[] args) {
        String holybook;
        char religion ='s';

        switch (religion) {
            case 'h': holybook="Srimad Bhagwat Gita";
                break;
            case 'p': holybook="Zenda Avista";
                break;
            case 's': holybook="Sri Guru Grant Sahib Ji";
                break;
            case 'm': holybook="Quran";
                break;
            case 'c': holybook="Bible";
                break;
            default: holybook="God Shiva Lord Kirhna";
        }
            System.out.println("The holybook chosen is "+holybook);
    }
}
