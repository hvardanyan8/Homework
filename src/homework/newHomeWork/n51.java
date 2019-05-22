package homework.newHomeWork;

public class n51 {

    public static void main(String[] args) {
        boolean t = n51(358);
        System.out.println(t);

    }
    public static boolean n51(int a) {
       int miavor = a%10;
       int tasnavor = (a%100 - a%10)/10;
       int haruravor = (a%1000 - a%100)/100;
       return (miavor == tasnavor+haruravor);
    }
}

