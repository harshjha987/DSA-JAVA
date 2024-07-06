package Strings;

public class reverse {
    public static void printreverse(char [] ch){
        int left = 0;
        int right = ch.length -1;
     
        while(left < right){
          char temp = ch[left];
          ch[left] = ch[right];
          ch[right] = temp;
          left++;
          right--;
        }
        System.out.print(ch);

    }
    public static void main(String[] args){
      char [] s = {'h','a','r','s','h'};

      printreverse(s);
     

    
}
}
