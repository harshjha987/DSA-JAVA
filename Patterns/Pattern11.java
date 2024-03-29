/*Solid Rhombus Pattern */

public class Pattern11 {

    public static void Rhombus(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k =1;k<=(n+1);k++){
                System.out.print("*");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rhombus(4);
    }
}

// output
//             *****
//            *****
//           *****
//          *****
