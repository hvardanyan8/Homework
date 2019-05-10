package homework;

public class n56 {

    public static void main(String[] args) {
        double a = 157;
        double miavor = a % 10;
        double tasnavor = (a % 100 - miavor) / 10;
        double haruravor = (a % 1000 - tasnavor) / 100;
     if (miavor>tasnavor){
         double k = (miavor + tasnavor + haruravor)/a;
         System.out.println(k);
     }else {
         System.out.println(a);

     }
    }
}


