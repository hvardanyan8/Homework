package homework.newHomeWork2;

public class n271 {

    public static void main(String[] args) {
        int n = 10;
        int tareriQanak = 0;

        char[] massiv = new char[n];
        massiv[0] = 'h';
        massiv[1] = 'u';
        massiv[2] = '4';
        massiv[3] = '.';
        massiv[4] = 'a';
        massiv[5] = 'd';
        massiv[6] = 'd';
        massiv[7] = 'd';
        massiv[8] = 'b';
        massiv[9] = 'r';

        for (int i = 0; i < n; i++) {
            if (massiv[i]=='a') {
                tareriQanak = tareriQanak+1;
            }
        }
        System.out.println(tareriQanak);

    }

}

