import java.util.Scanner;

public class basic{

    public static boolean search(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
     
        System.out.println("Enter value to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]== target){
                    System.out.println("Element found at "+i+","+j);
                    return true;
                }
              

            }
        }
       System.out.println("key not found");
       return false;
     
    }

    public static int Largest(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int matrix [] [] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of the 2d array");
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       search(matrix);
       int max = Largest(matrix);
       System.out.println("The largest element in matrix is: "+ max);
        sc.close();
    }
}