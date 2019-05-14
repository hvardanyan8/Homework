package homework;

public class n160 {

    public static void main(String[] args) {
        for (int i = 101; i <= 999; i++) {
           if(Math.pow(i*16,0.5) % 1 ==0){
               System.out.println(i);
               break;
           }
        }

    }
}



