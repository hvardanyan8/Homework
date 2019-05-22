package homework.newHomeWork2;

public class n250 {

    public static void main(String[] args) {
        int n = 10;
        int artadryal = 1;

        int[] massiv = new int[n];
        massiv[0] = 5;
        massiv[1] = -24;
        massiv[2] = 2;
        massiv[3] = 7;
        massiv[4] = 5;
        massiv[5] = 51;
        massiv[6] = -100;
        massiv[7] = 22;
        massiv[8] = -6;
        massiv[9] = 3;

        for (int i = 0; i < n; i++) {
            if ((massiv[i]*i)%3==2) {
                artadryal = (int) (artadryal * Math.pow(massiv[i],2));
            }
        }
        System.out.println(artadryal);

    }

}

