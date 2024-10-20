public class SecondSmallest{
    public static void main(String args[]){
        int arr[] = {9,15,3,10,1};
        int first = Integer.MAX_VALUE , second = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if(second > arr[i]){
                second = arr[i];
            }

        }
        System.out.println(second);
    }
}