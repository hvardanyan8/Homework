package homework;

public class n53 {

    public static void main(String[] args) {
        boolean t;
        double a = 222;
        double k =500;
        double miavor = a % 10;
        double tasnavor = (a % 100 - miavor) / 10;
        double haruravor = (a % 1000 - tasnavor) / 100;
        if (k<a) {

            double ardyunq = a/(miavor+tasnavor+haruravor);
            System.out.println(ardyunq);
        } else {
            double ardyunq = miavor/a;
            System.out.println(ardyunq);

        }

    }
}


