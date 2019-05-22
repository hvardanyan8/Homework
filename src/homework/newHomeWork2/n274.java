package homework.newHomeWork2;

public class n274 {

    public static void main(String[] args) {
        int n = 10;
        int gumar = 0;
        int qanak = 0;
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
            if (massiv[i] > 'h') {
                gumar = gumar + i;
                qanak++;
            }
        }
        if(qanak!=0){
            double mijinTvabanakan = gumar/qanak;
        System.out.println(mijinTvabanakan);
        }
    }

}

