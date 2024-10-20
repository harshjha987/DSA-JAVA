package Strings;

public class Strings {
    public static String subString(String s,int ei, int si){
        String Substr = "";
        for(int i =ei;i<si;i++){
            Substr += s.charAt(i);
        }
        return Substr;
    }
    public static void main(String[]args){
        String s = new String("harshjha");
        System.out.print(subString(s, 0, 5));

    }
    
}
