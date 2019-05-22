package homework.newHomeWork;

public class n152 {

    public static void main(String[] args) {
        int artadryal = 1;
        int n = 24;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                artadryal = artadryal * i;
            }
        }
        System.out.println(artadryal);
    }
}



