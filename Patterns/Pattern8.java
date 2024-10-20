/* Hollow Rectangle pattern */
public class Pattern8 {

    public static void hollowRectangle(int toRows, int toCols){
        for(int i =1; i<=toRows; i++){
                //inner loop
                for(int j =1;j<=toCols;j++){
                    if(i==1|| i==toRows || j==1 || j== toCols){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(4,5);
       
    }


}


/*
 * Output
    *****
    *   *
    *   *
    *****
 */
