package Recursion;

public class fibonacci {
    public static int fibo(int n){
        int ans;
        if(n==0 || n==1){
            return n;
        }
        
        ans =  fibo(n-1) + fibo(n-2);
        return ans;
    }
    public static void main (String[] args){
        System.out.print(fibo(3));
    }
    
}
