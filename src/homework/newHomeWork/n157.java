package homework.newHomeWork;

public class n157 {

    public static void main(String[] args) {
        long gumar = 0;
        for (int i = 100; i <= 999; i++) {
            if ( i % 5!=0) {
                gumar = gumar + i;
                System.out.println(gumar + " " + i);
            }
        }
    }
}



