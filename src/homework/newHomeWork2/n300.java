package homework.newHomeWork2;

public class n300 {

    public static void main(String[] args) {
        int n = 10;
        int j = 0;
        int k = 75;
        int[] x = new int[n];
        int[] y = new int[n];
        x[0] = 5;
        x[1] = -24;
        x[2] = 2;
        x[3] = 7;
        x[4] = 5;
        x[5] = 49;
        x[6] = -100;
        x[7] = 22;
        x[8] = -6;
        x[9] = 3;


        for (int i = 0; i < n; i++) {
            if (Math.pow(x[i] ,2)< k) {
                y[j] = x[i];
                j++;
            }
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }

}

