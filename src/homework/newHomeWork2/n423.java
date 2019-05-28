package homework.newHomeWork2;

public class n423 {

    public static void main(String[] args) {
        int m = 3;
        double sum=0;
        int[][] name = new int[m][m];
        name[0][0] = 9;
        name[0][1] = 415;
        name[0][2] = 100;
        name[1][0] = 5;
        name[1][1] = 3;
        name[1][2] = 4;
        name[2][0] = 4;
        name[2][1] = 9;
        name[2][2] = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
            if(i>=j){
                sum =Math.pow(name[i][j],2)+sum;


            }
            }
        }

            System.out.println(Math.sqrt(sum) );

    }

}

