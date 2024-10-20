public class sum {
    public static int SUM(int n){
        int sum = 0;
        if(n==0){
            return 0;

        }
        sum = n + SUM(n-1);
        return sum;
    }
    public static void main(String[]args){
        System.out.print(SUM(10));
    }
    
}
