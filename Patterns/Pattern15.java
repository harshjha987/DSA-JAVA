/*Palindromic Patrtern with Numbers */
public class Pattern15 {
    public static void Palindromic_Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
           
            for(int j=i;j>=1;j--){
                System.out.print(j);
               
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Palindromic_Pattern(5);
    }
}

/*  Output :-
                 1    
                212   
               32123  
              4321234 
             543212345
*/