/* printing max sum of subarray using prefix sum method */

public class Array8 {
    public static void maxSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum:"+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,5,7};
        maxSubArray(arr);


    }
    
}
