package Recursion;
// print numbers in dec order from n to 1
public class numbersindec {
    public static void printnumbers(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printnumbers(n-1);
       
      
    }
    public static void incnumber(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        incnumber(n+1);

    }
    public static void main(String[]args){
        printnumbers(10);
        System.out.println("");
        incnumber(1);

    }
    
}
