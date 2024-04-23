import java.util.Scanner;
public class Array5 {
    public static void ReverseArray(int num[]){
        int start=0 , end= num.length-1;
        while(start < end){
            //swap the elements
            int temp = num[end];
            num[end] =num[start];
            num[start] = temp; 
            start ++;
            end --;

        }
      
    }

    
    public static void main(String[] args) {
        System.out.println("Enter Range of Array" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of Array: ");
        for(int i =0;i<n;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
         ReverseArray(arr);
         System.out.println("The reversed Array is: ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
      
        sc.close();

    }
    
}
