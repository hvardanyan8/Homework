package homework.newHomeWork2;

public class n212 {

    public static void main(String[] args) {
        int n = 10;
        double gummar = 0;

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
            if (massiv[i] > 0) {
                gummar = gummar + Math.pow(massiv[i], 2);
            }
        }

        double qarakusayinTvabanakan =Math.pow(gummar,0.5);
        System.out.println(qarakusayinTvabanakan);
    }

}

