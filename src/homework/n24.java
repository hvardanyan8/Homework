package homework;

public class n24 {

    public static void main(String[] args) {
        checkIf2Exist(2,1,2);
    }
    public static void checkIf2Exist(int a, int b, int c){
      if((a==2 && b==2 && c!=2) || (a==2 && c==2 && b!=2) || (c==2 && b==2 && a!=2) ){
          System.out.println(true);

      } else{
          System.out.println(false);
      }
    }
}

