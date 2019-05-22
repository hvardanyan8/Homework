package homework.newHomeWork;

public class n151 {

    public static void main(String[] args) {
        int gumar = 0;
        int n = 24;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                gumar = gumar + i;
            }
        }
        System.out.println(gumar);
    }
}



