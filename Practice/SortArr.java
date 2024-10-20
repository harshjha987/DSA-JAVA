public class SortArr{
    public static void sort(int arr[]){
        int ones = 0 , zeroes = 0, n = arr.length;
        for(int num : arr){
            if(num == 0) zeroes++;
            else if(num ==1) ones ++;
        }
        for(int i =0;i<zeroes;i++){
            arr[i] = 0;

        }
        for(int i = zeroes;i<zeroes+ones;i++){
            arr[i] = 1;
        }
        for(int i = zeroes+ones ; i<n;i++){
            arr[i] = 2;
        }

    }
    public static void main(String args[]){
        int arr[] = {2,1,0,0,1,2,2};
        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}