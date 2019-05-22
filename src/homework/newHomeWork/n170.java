package homework.newHomeWork;

public class n170 {

    public static void main(String[] args) {
        int n = 192;
        for (int i = n + 1; i < Integer.MAX_VALUE; i++) {
            if (Math.pow(i, 0.5) % 1 == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}



