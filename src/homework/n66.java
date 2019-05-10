package homework;

public class n66 {

    public static void main(String[] args) {
        int a = 3144;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (tasnavor == 4 || haruravor == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


