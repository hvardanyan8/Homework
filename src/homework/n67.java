package homework;

public class n67 {

    public static void main(String[] args) {
        int a = 1089;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (Math.pow((tasnavor + miavor + haruravor + hazaravor),2) == a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


