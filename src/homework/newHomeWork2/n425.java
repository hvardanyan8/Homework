package homework.newHomeWork2;

public class n425 {

    public static void main(String[] args) {
        int m = 3;
        int count =0;
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
            if(i>j&&name[i][j]%2==0){
                count++;



            }
            }
        }

            System.out.println(count);

    }

}

