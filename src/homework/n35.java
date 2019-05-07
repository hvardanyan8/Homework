package homework;

public class n35 {

    public static void main(String[] args) {
        n35(5,1,2,2);
    }
    public static void n35(int a, int b, int c, int d) {
       if(a == b+c+d||b==a+c+d || c == a+b+d || d == a+b+c){
           System.out.println(true);
       }else {

           System.out.println(false);
       }
    }
}

