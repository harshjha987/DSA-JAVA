
/* Trapping rainwater */
public class Array10 {
    public static int trappingRainwater(int ht[]){
        int n = ht.length;
        //calculate left max boundary -array
        int leftMax[] = new int[n];
        leftMax[0] = ht[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(ht[i],leftMax[i-1]);
        }
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = ht[n-1];
        for(int j= n-2 ;j>=0;j--){
            rightMax[j] =Math.max(ht[j],rightMax[j+1]);

        }
        int trappedWater = 0;
        for(int i =0;i<n;i++){
            int waterLevel = Math.min(rightMax[i],leftMax[i]);
            trappedWater +=  waterLevel - ht[i];

            

        }
        return trappedWater;

       
        

    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int res = trappingRainwater(height);
        System.out.println("trapped water"+ res);
    }
    
}
