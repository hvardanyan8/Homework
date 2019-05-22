package homework.newHomeWork;

public class n159 {

    public static void main(String[] args) {
        long artadryal = 1;
        for (int i = 100; i <= 999; i++) {
            if (i % 3==1 && i % 4==2) {
                artadryal = artadryal * i;
                System.out.println(artadryal + " " + i);
            }
        }
    }
}



