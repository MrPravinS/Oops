package patterns;

public class pattern_04 {
    public static void pattern04(int n){
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
      }
    }

    public static void main(String[] args) {
        pattern04(5);
    }
}
