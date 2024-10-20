package Strings;

public class StringCompression {
    public static int compress(char [] ch){
       
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        for(int i =0;i<sb.length();i++){
            Integer count = 1;
            while(i<sb.length()-1 && sb.charAt(i) == sb.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(sb.charAt(i));
            if(count>1){
                sb.append(count);
            }

        }
        return sb.length();
        

    }
    public static void main(String[] args){
        char [] ch  = {'a','a','b','b','c','c','c'};
        System.out.print(compress(ch));

       
    }
    
}
