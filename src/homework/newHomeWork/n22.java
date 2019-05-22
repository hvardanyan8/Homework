package homework.newHomeWork;

public class n22 {

    public static void main(String[] args) {
        findMinimum(7,8,9);
    }
    public static void findMinimum(int a, int b, int c){
        int min;
        if(a<b){
            if(a<c){
                min = a;
            }else {
                min = c;
            }
        }else {
            if(b<c){
                min = b;
            }else {
                min = c;
            }
        }
        System.out.println(min);
    }
}

