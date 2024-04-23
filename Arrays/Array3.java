import java.util.Scanner;

public class Array3 {
    public static int getSmallest(int nums[]){
        int min = Integer.MAX_VALUE; //get + infinity
        for(int i =0;i<nums.length;i++){
            if(min > nums[i]){
                min = nums[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the range of Array");
        int n =  sc.nextInt();
        System.out.println("Enter the values of Array: ");
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = getSmallest(arr);
        System.out.println("Smallest element in Array is " + smallest);
        sc.close();
    }
    
}
