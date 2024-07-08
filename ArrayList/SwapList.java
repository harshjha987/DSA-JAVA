package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapList {

    public static void swap(ArrayList<Integer> list, int ind1 ,int ind2){
   
      
            int temp = list.get(ind1);
            list.set(ind1,list.get(ind2));
            list.set(ind2,temp);
        
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter range of list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter elements of array");
        for(int i =0;i<n;i++){
            int elem = sc.nextInt();
            list.add(elem);

        }
        swap(list, 2, 1);
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        sc.close();

    }
}
