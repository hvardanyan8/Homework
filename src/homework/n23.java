package homework;

public class n23 {

    public static void main(String[] args) {
        checkIf1Exist(7,8,1);
    }
    public static void checkIf1Exist(int a, int b, int c){
       if(a==1 || b==1 || c == 1){
           System.out.println(true);
       }else {
           System.out.println(false);
       }
    }
}

