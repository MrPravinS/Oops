package recursion;

public class basics {

    public static void recBascis(int i,int n){
        if(i > n) return;
        recBascis(i+1,n);
       System.out.println("Pravin");
    }
public static void main(String[] args) {
    
    recBascis(1,3);
}
    
}