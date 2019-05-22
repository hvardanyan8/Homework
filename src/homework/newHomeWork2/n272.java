package homework.newHomeWork2;

public class n272 {

    public static void main(String[] args) {
        int n = 10;
        boolean t;
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
            if (massiv[i] == 'b') {
                tareriQanak = tareriQanak + 1;
            }
        }
        if (tareriQanak == n / 2) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }

}

