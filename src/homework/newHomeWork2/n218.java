package homework.newHomeWork2;

public class n218 {

    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        int tarreriQanak = 0;

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
            if (i % k == 0) {
                tarreriQanak = tarreriQanak + 1;
            }
        }
        System.out.println(tarreriQanak);

    }

}

