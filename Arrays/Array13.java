/* Plus one leetcode problem */

import java.util.Scanner;

public class Array13 {
    public static int[] plusOne(int nums[]){
        int n = nums.length;
        for(int i =n-1;i>=0;i--){
            if(nums[i]<9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        nums = new int[n+1];
        nums[0] = 1;
        return nums;

    }
    public static void main(String[] args) {
        System.out.println("Enter range of Array");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        int res[] = plusOne(arr);
        for(int i =0;i<arr.length;i++){
            
            System.out.print(res[i]);
        }
           
        

        sc.close();
    }
    
}
