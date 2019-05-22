package homework.newHomeWork;

public class n158 {

    public static void main(String[] args) {
        long artadryal = 1;
        for (long i = 100; i <= 999; i++) {
            if ( i % 2!=0 && i % 3!=0) {
                artadryal = artadryal * i;
                System.out.println(artadryal + " " + i);
            }
        }
    }
}



