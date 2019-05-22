package homework.newHomeWork;

public class n70 {

    public static void main(String[] args) {
        int y;
        int a = 1987;
        int miavor = a % 10;
        int tasnavor = (a % 100 - a % 10) / 10;
        int haruravor = (a % 1000 - a % 100) / 100;
        int hazaravor = (a % 10000 - a % 1000) / 1000;
        if (miavor*tasnavor*haruravor * hazaravor > 200) {
            y = 0;
        } else {
            y = 1;
        }
            System.out.println(y);
    }
}


