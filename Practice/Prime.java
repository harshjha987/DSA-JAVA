import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        System.out.print("Enter number to check: ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c=0;
      for(int i =1;i<n;i++){
        if(n%i==0){
            c++;
        }
      }
      if(c ==1){
        System.out.print("It is a prime number.");
      }
      else{

      System.out.print("It is not a prime number.");
      }
      sc.close();
    }
    
}
