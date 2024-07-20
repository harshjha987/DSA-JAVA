public class CLI{
    public static void main(String args []){
        System.out.print("Argument is : ");
        for(int i =0;i<args.length;i++){
            System.out.print( args[i] + " ");
        }
       System.out.println();
        System.out.print("Length is " + args.length);
    }
}