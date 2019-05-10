package homework;

public class n69 {

    public static void main(String[] args) {
        int y;
        int a = 1087;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (miavor+tasnavor+haruravor + hazaravor > 20) {
            y = 1;
        } else {
            y = 0;
        }
            System.out.println(y);
    }
}


