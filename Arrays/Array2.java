


public class Array2 {
    public static int Largest(int num[]){
        int max = Integer.MIN_VALUE; // minus infinity
        for(int i =0;i<num.length;i++){
            if(max<num[i]){
                 max = num[i];
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int num[] = {12,222,11,111};
        int largest = Largest(num);
        System.out.println("The largest element in array is :"+ largest );

    }
    
}
