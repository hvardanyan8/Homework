package homework;

public class n62 {

    public static void main(String[] args) {
        boolean t;
        int a = 3562;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a%10) / 10;
        int haruravor = (a % 1000 - a%100) / 100;
        int hazaravor = (a%10000- a%1000)/1000;
        if(miavor+tasnavor == hazaravor+haruravor){
            t=true;
        }else {
            t=false;
        }
        System.out.println(t);
    }
}


