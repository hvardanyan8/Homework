package homework;

public class n155 {

    public static void main(String[] args) {
        int gumar = 0;
        for (int i = 10; i <= 99; i++) {
            if (i % 3 == 0) {
                gumar = gumar + i;
            }
        }
        System.out.println(gumar);
    }
}



