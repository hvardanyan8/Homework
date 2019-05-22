package homework.newHomeWork2;

public class n276 {

    public static void main(String[] args) {
        int n = 10;
        boolean t = false;
        char[] massiv = new char[n];
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
            if (massiv[i] == 'r') {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }

}

