package homework.newHomeWork2;

public class n457 {

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
            int sum =0;
            for (int j = 0; j < n; j++) {
               if(name[i][j]%2==1){
                   sum+=name[i][j];
               }

                            }
            B[i] =sum;
            System.out.println(B[i]);
        }

    }

}

