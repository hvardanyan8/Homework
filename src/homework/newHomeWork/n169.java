package homework.newHomeWork;

public class n169 {

    public static void main(String[] args) {
        double x=53;
        double y=44 ;
        double z=555 ;
        for(int i=2; i<x+y; i++){
            if ((x+y)%i==0){
                z=6;
                break;
            }else z=5;
        }
        System.out.println(z);
    }
}



