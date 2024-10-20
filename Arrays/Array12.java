/* Container with most water */
public class Array12 {
    public static int containerWithMostWater(int ht[]){
        int n = ht.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max(maxArea,(right-left)*Math.min(ht[right],ht[left]));
            if(ht[left]<ht[right]){
                left++;

            }
            else{
                right--;
            }
        }
        return maxArea;
        
    }
    public static void main(String[] args) {
        int height[] =  {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(height));
    }
    
}
