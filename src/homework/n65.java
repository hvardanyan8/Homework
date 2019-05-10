package homework;

public class n65 {

    public static void main(String[] args) {
        int a = 3134;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (miavor * tasnavor == 12) {
            System.out.println("y = 12");
        } else {
            System.out.println("y = 0");
        }
    }
}


