package homework.newHomeWork2;

public class n279 {

    public static void main(String[] args) {
        int n = 10;
        int j = 0;
        char[] massiv = new char[n];
        char[] massiv2 = new char[n];
        massiv[0] = 'h';
        massiv[1] = 'u';
        massiv[2] = 's';
        massiv[3] = '.';
        massiv[4] = 'a';
        massiv[5] = 'd';
        massiv[6] = 'd';
        massiv[7] = 's';
        massiv[8] = 'b';
        massiv[9] = 'r';


        for (int i = 0; i < n; i++) {
            if (massiv[i] < 'k') {
                massiv2[j] = massiv[i];
                j++;
            }
        }
        System.out.println(massiv2);
    }

}

