package homework.newHomeWork2;

public class n222 {

    public static void main(String[] args) {
        int n = 10;
        int c =2;
        int d =8;
        double artadryal = 1;

        double[] massiv = new double[n];
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
            if (massiv[i] >=c && massiv[i]<d) {
               artadryal = artadryal * massiv[i];
            }
        }
        System.out.println(artadryal);

    }

}

