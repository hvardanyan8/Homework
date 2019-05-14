package homework;

public class n161 {

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
           if(Math.pow(i*26,0.5) % 1 ==0){
               System.out.println(i);
               break;
           }
        }

    }
}



