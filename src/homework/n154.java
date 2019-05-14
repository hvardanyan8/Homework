package homework;

public class n154 {

    public static void main(String[] args) {
        int artadryal = 1;
        int n = 24;
        for (int i = 1; i <= n; i++) {
            if (n % i == 3) {
                artadryal = artadryal * i;
            }
        }
        System.out.println(artadryal);
    }
}



