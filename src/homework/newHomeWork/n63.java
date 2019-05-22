package homework.newHomeWork;

public class n63 {

    public static void main(String[] args) {
        int t;
        int a = 3162;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a%10) / 10;
        int haruravor = (a % 1000 - a%100) / 100;
        int hazaravor = (a%10000- a%1000)/1000;
        if(miavor==1||tasnavor==1||haruravor==1||hazaravor==1){
            t=1;
        }else {
            t=0;
        }
        System.out.println(t);
    }
}


