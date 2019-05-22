package homework.newHomeWork;

public class n34 {

    public static void main(String[] args) {
        n34(5,7,3,1);
    }
    public static void n34(int a, int b, int c, int d) {
        if (a + b == c + d || a+ c == b + d || b + c == a+d) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

