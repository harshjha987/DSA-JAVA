package Recursion;

public class powerOptimized {

    public static double findPow(double x ,int n){
        double ans;
      
        if(n==0){
            return 1;
        }
         double halfsq = findPow(x,n/2);
       
        if(n<0){
           n=-n;
           x=1/x; 
        }
        ans = halfsq * halfsq;
        if(n%2!=0){
            ans = x * halfsq * halfsq;
        }
        return ans;
    }
    public static void main (String[]args){
        System.out.print(findPow(2,-2 ));
    }
    
}
