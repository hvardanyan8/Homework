package homework.newHomeWork;

public class n30 {

    public static void main(String[] args) {
        nvazmanKarg(2,1,888);
    }
    public static void nvazmanKarg(int a, int b, int c){
        int mijin = 0;
        int min = findMinimum(a, b, c);
        int max = findMaximum(a,b,c);
        if(a != min && a != max){
            mijin = a;
        }else if(b != min && b != max){
            mijin = b;
        }else if(c != min && c != max){
            mijin = c;
        }
        System.out.println(max + " " + mijin + " " + min);
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
        return max;
    }
    public static int findMinimum(int a, int b, int c){
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
        return min;
    }
}

