package homework.newHomeWork;

public class n36 {

    public static void main(String[] args) {
        n36(5,1,2,2);
    }
    public static void n36(int a, int b, int c, int d) {
       if((a%2 == 1 && b%2==1)||(a%2 == 1 && c%2==1)||(a%2 == 1 && d%2==1)||(c%2 == 1 && b%2==1)||(d%2 == 1 && b%2==1)||(c%2 == 1 && d%2==1)){


           System.out.println(true);
       }else {

           System.out.println(false);
       }
    }
}

