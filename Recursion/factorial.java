package Recursion;

public class factorial {
    public static int fact(int n){
        int factorial;
        if(n==0){
            return 1;
        }
        factorial = n * fact(n-1);
        return factorial;
    }
    public static void main(String[] args){
        System.out.print(fact(5));
    }
    
}
