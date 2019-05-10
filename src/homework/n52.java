package homework;

public class n52 {

    public static void main(String[] args) {
        boolean t;
        int a = 222;
        int miavor = a % 10;
        int tasnavor = (a % 100 - miavor) / 10;
        int haruravor = (a % 1000 - tasnavor) / 100;
        if (miavor == haruravor || miavor == tasnavor || tasnavor == haruravor) {
            t = true;
        } else {
            t = false;
        }
         System.out.println(t);
    }
}


