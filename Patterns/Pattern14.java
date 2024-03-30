/* Number Pyramid */

public class Pattern14 {

    public static void Number_Pyramid(int n){
    
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i);
                System.out.print(" ");
                
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Number_Pyramid(5);
    }
}

/* Output :- 

                1      
               2 2     
              3 3 3    
             4 4 4 4   
            5 5 5 5 5   
   */
