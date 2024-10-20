package ArrayList;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i =1;i<=10;i++){
            list1.add(i);
        }
        list1.add(1,9);//add elemen at particular index
        
        list2.add("Harsh");
        System.out.println(list1 + " " + list2);
        System.out.println(list1.get(3)); //to access the element in arraylist
        list1.remove(3);
        System.out.println(list1);
        list1.set(3,4); //replaces the current element at given index
        System.out.println(list1);
        System.out.println(list1.contains(4)); //element exist in arraylist or not

        System.out.println(list1.size());
        System.out.print(list2.size());
    }
    
}
