package homework.newHomeWork;

public class n60 {

    public static void main(String[] args) {
        int a = 533;
        int miavor = a % 10;
        int tasnavor = (a % 100 - miavor) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int min, max, mijin ;

        if (miavor <= tasnavor && miavor <= haruravor) {
            min = miavor;

        } else {
            if (tasnavor <= miavor && tasnavor <= haruravor) {
                min = tasnavor;
            } else {
                min = haruravor;
            }
        }
        if (miavor > tasnavor && miavor > haruravor) {
            max = miavor;

        } else {
            if (tasnavor > miavor && tasnavor > haruravor) {
                max = tasnavor;
            } else {
                max = haruravor;
            }
        }
        if ((min==miavor && max ==tasnavor)||(min==tasnavor && max==miavor) ){
            mijin=haruravor;

        }else if((min ==tasnavor && max==haruravor)||(min == haruravor && max ==tasnavor)){
            mijin = miavor;
        }else {
            mijin =tasnavor;
        }
        System.out.println(max + " " + mijin + " " +min );

    }
}


