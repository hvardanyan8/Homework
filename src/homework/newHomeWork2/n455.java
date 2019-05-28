package homework.newHomeWork2;

public class n455 {

    public static void main(String[] args) {
        int m = 3;
        int sum = 0;
        double[][] name = new double[m][m];
        double[] b = new double[m];
        name[0][0] = 9;
        name[0][1] = 4;
        name[0][2] = 100;
        name[1][0] = 6;
        name[1][1] = 3;
        name[1][2] = 4;
        name[2][0] = 4;
        name[2][1] = 9;
        name[2][2] = 5;
        for (int i = 0; i < m; i++) {
            b[i] = (name[i][i]*name[i][m-1-i]);
            System.out.println(b[i]);
        }
    }

}


