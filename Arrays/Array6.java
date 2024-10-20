/* pairs in a array */

public class Array6 {
    public static void makePairs(int arr[]){
        int tp=0;
     
        for(int i =0;i<arr.length;i++){
            
            for( int j =i+1;j<arr.length;j++){
               
                    System.out.print("("+arr[i] +"," +arr[j]+ ")");;
                    tp++;
                
            }
            System.out.println();
           
            
           
          
        }
        System.out.println("The total number of pairs are : " + tp);

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("The Pairs in Array are: ");
        makePairs(arr);

    }
    
}
