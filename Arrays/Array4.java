import java.util.Scanner;

public class Array4 {
    public static int BinarySearch(int num[],int key){
        int start =0 ,end = num.length-1;
      
       
     
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]== key){
                return mid;
            }
            else if(num[mid]<key){
                start = mid +1;
            }
            else{
                end = mid-1;

            }
        }
        return -1;

       }



    
    public static void main(String[] args) {
        System.out.println("Enter Range of Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Elements of Array: ");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the value to check: ");
        int key = sc.nextInt();
        int res = BinarySearch(arr, key);
        System.out.println("The numbers is at index "+ res);
        sc.close();
    }
    
}
