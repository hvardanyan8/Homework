package homework.newHomeWork;

public class n153 {

    public static void main(String[] args) {
        int gumar = 0;
        int n = 24;
        for (int i = 1; i <= n; i++) {
            if (n % i == 2) {
                gumar = gumar + i;
            }
        }
        System.out.println(gumar);
    }
}



