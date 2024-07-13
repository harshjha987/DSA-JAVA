package Backtracking;

public class Subsets {
    public static void subsets(int arr[] ,int ans[],int i){
        //base case
        if(i== arr.length){
            if(ans.length == 0){
                System.out.print("null");
            }
            else{
                System.out.println(ans);
            }
           
            return;
        }
        
        //rec
        subsets(arr,ans+arr[i],i+1);

        subsets(arr,ans,i+1);



    }
    public static void main(String args[]){
        int num [] = {1,2,3};
        subsets(num,[0],0);

    }
}
