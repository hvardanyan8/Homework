package homework.newHomeWork;

public class n55 {

    public static void main(String[] args) {
        boolean t;
        int a = 152;
        int miavor = a % 10;
        int tasnavor = (a % 100 - miavor) / 10;
        int haruravor = (a % 1000 - tasnavor) / 100;
        if (miavor < tasnavor && miavor < haruravor) {
            System.out.println(miavor);

        } else {
            if (tasnavor < haruravor && tasnavor < miavor){
                System.out.println(tasnavor);
            }else {
                System.out.println(haruravor);
            }
        }

    }
}


