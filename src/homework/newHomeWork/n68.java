package homework.newHomeWork;

public class n68 {

    public static void main(String[] args) {
        int y;
        int a = 1047;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (miavor > tasnavor) {
            System.out.println(miavor * haruravor);
        } else {
            System.out.println(1);
        }
    }
}


