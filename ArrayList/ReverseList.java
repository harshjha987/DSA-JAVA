package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseList {

    public static int findMax(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<list.size() ;i++){
            max = Math.max(max,list.get(i));
        }
        return max;

    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int elem = sc.nextInt();
            list.add(elem);
        }
        for(int i =n-1;i>=0;i--){
            System.out.print(list.get(i));
            if (i > 0) {
                System.out.print(" "); // Adding space between elements
            }
        }
        System.out.println("");
        System.out.println("Largest element in ArrayList is: ");
        System.out.print(findMax(list));
        sc.close();
    }
    
}
