package homework;

public class n57 {

    public static void main(String[] args) {
        double a = 300;
        double miavor = a % 10;
        double tasnavor = (a % 100 - miavor) / 10;
        double haruravor = (a % 1000 - tasnavor) / 100;
         if(a>300){
             double k= tasnavor/miavor;
             System.out.println(k);
         }else{
             double t = haruravor/miavor;
             System.out.println(t);

         }
    }
}


