// Inverted and Rotated Half Pyramid Pattern

public class Pattern5 {

    public static void pyramid(int n){
       
        for(int i =1;i<=n;i++){
            for(int j =1;j<= n-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       
            pyramid(4);
    }
}

// Output

//    *
//   **
//  ***
// ****