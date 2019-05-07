package homework;

public class n27 {

    public static void main(String[] args) {
        tvabanakanProgresia(2,1,888);
    }
    public static void tvabanakanProgresia(int a, int b, int c){
        if(b-a==c-b){
            System.out.println(true);

        }else{
            System.out.println(false);
        }
    }
}

