package homework;

public class n156 {

    public static void main(String[] args) {
        long artadryal = 1;
        for (int i = 10; i <= 99; i++) {
            if (i % 3 == 0 && i % 5==0) {
                artadryal = artadryal * i;
                System.out.println(artadryal + " " + i);
            }
        }
    }
}



