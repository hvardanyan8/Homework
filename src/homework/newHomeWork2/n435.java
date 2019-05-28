package homework.newHomeWork2;

public class n435 {

    public static void main(String[] args) {
        int n = 3;
        int count=0;
        int[][] name = new int[n][n];
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
            for (int j = 0; j < n; j++) {
            if(i+j<n-1&&name[i][j]%5==0){
               count++;



            }
            }
        }

            System.out.println(Math.sqrt(count));

    }

}

