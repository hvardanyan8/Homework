package homework.newHomeWork;

public class n162 {

    public static void main(String[] args) {
        for (int i = 9999; i >= 1000; i--) {
           if(Math.pow(i*14,0.5) % 1 ==0){
               System.out.println(i);
               break;
           }
        }

    }
}



