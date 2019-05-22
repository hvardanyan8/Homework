package homework.newHomeWork;

public class n164 {

    public static void main(String[] args) {
        int n = 17;
        for (int i = 100; i <= 999; i++) {
           if(Math.pow(i,0.5) >n){
               System.out.println(i);
               break;
           }
        }

    }
}



