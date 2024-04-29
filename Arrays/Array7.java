/*Print all sub-arrays */
/* Brute force method */

public class Array7 {
    public static void printSubArrays(int arr[]){
        
        int maxSum = Integer.MIN_VALUE;
        
        for(int i =0;i<arr.length;i++){
            int sum =0;
           
            for(int j =i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print( arr[k] + " ");
                     sum  +=  arr[k];
                
                }
               
                if(sum > maxSum) {
                    maxSum = sum; // Update maxSum if the current sum is greater
                }
                
               sum =0;
              
                
              
               
                 
               

                System.out.println();
                
               
               
        }

        System.out.println();
        
        
        
      
        
    }
    
    
    System.out.println("The maximum sum of subarray is: " + maxSum);

  

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("The Subarrays are : ");
        printSubArrays(arr);

    }
}
