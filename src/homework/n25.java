package homework;

public class n25 {

    public static void main(String[] args) {
        checkIfTriangle(2,1,2);
    }
    public static void checkIfTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("y=1");
        }else{
            System.out.println("y=2");

        }
    }
}

