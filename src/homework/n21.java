package homework;

public class n21 {

    public static void main(String[] args) {
        findMaximum(7,8,9);

        int max = findMaximum(7,8,9);

    }
    public static int findMaximum(int a, int b, int c){
        int max;
        if(a>b){
            if(a>c){
                max = a;
            }else {
                max = c;
            }
        }else {
            if(b>c){
                max = b;
            }else {
                max = c;
            }
        }
        System.out.println(max + "AAA");
        return max;
    }
}

