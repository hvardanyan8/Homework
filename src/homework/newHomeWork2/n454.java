package homework.newHomeWork2;

public class n454 {

    public static void main(String[] args) {
        int n = 3;
        int[][] name = new int[n][n];
        long[] B = new long[n];
        name[0][0] = 9;
        name[0][1] = 4;
        name[0][2] = 100;
        name[1][0] = 6;
        name[1][1] = 3;
        name[1][2] = 4;
        name[2][0] = 4;
        name[2][1] = 9;
        name[2][2] = 5;
        for (int i = 0; i < n; i++) {
            long artadryal=1;
            for (int j = 0; j < n; j++) {
                artadryal*=Math.pow(name[i][j],2);

                            }
            B[i] = artadryal;
            System.out.println(B[i]);
        }

    }

}

