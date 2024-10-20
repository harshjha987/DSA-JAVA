import java.util.Scanner;

public class fibo {
    public static void main(String args[]){
        int a = 0 , b =1 , c;
        System.out.print("Enter Range :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series is: ");
        System.out.print(a + " " + b +" ");
        for(int i =2;i<n;i++){
            c = a+b;
            System.out.print(c+ " ");
            a=b;
            b = c;

        }
        sc.close();
       
    }
    
}
