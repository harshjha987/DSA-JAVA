/*
 * 0-1 Triangle Pattern.
 
 */

public class Pattern9 {

    public static void zero_one_Triangle(){
        int n = 5;
        
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2== 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
               
            }
           
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_one_Triangle();
    }
    
}
/*
 * Output
 * 1
   01
   101
   0101
   10101
 */
