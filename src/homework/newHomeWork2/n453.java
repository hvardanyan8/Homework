package homework.newHomeWork2;

public class n453 {

    public static void main(String[] args) {
        int n = 3;
        int a = 2;
        int b = 17;
        int[][] name = new int[n][n];
        int[] B = new int[n];
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
            int gumar = 0;
            for (int j = 0; j < n; j++) {
                if (name[i][j] >= a && name[i][j] <= b) {
                    gumar += name[i][j];
                }
            }
            B[i] = gumar;
            System.out.println(B[i]);
        }

    }

}

