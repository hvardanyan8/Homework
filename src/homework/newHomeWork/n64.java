package homework.newHomeWork;

public class n64 {

    public static void main(String[] args) {
        String y;
        int a = 3132;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a%10) / 10;
        int haruravor = (a % 1000 - a%100) / 100;
        int hazaravor = (a%10000- a%1000)/1000;
        if(miavor + tasnavor == 5){
            y="s";
        }else {
            y="d";
        }
        System.out.println(y);
    }
}


