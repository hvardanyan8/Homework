package homework.newHomeWork;

public class n58 {

    public static void main(String[] args) {
        String f;
        double a = 300;
        double miavor = a % 10;
        double tasnavor = (a % 100 - miavor) / 10;
        double haruravor = (a % 1000 - tasnavor) / 100;
        if ((tasnavor + haruravor) < 5) {
            f="a";
        }else {
            f="b";
        }
        System.out.println(f);
    }
}


