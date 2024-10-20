package Strings;

import java.util.Scanner;

public class palindrome {

    public static boolean findPal(String str){
      
        str = str.replaceAll("[^a-zA-Z0-9]/g","").toLowerCase();
        int n = str.length();
        for(int i =0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print(findPal(str));
        sc.close();

    }
    
}
