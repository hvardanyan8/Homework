package homework;

public class n168 {

    public static void main(String[] args) {
        int n=13 ;
        boolean p = true;
        for(int i=2; i<n; i++){
            if (n%i==0){
                p = false;
                break;
            }else p=true;
        }
        System.out.println(p);
    }
}



