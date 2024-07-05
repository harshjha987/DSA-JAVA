package Recursion;

public class power {
    public static double findPow(double n, int pow){
        double ans;
      
        if(pow==0){
            return 1;
        }
         double halfsq = findPow(n,pow/2);
       
        if(pow<0){
           pow=-pow;
           n=1/n; 
        }
        ans = halfsq * halfsq;
        if(n%2!=0){
            ans = n * halfsq * halfsq;
        }
        return ans;
    }
    public static void main(String[]args){
        System.out.print(findPow(2,-3));
    }
    
}
