/* Hollow Rhombus */

public class Pattern12 {
    public static void Hollow_Rhombus(int toCols , int toRows){
        for(int i =1;i<=toRows;i++){
            for(int j=1;j<=(toRows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=toCols;k++){
                if(i==1|| i==toRows || k==1 || k== toCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(toRows-i);j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Hollow_Rhombus(5,5);
    }
}

 /* Output :-
            *****    
           *   *   
          *   *  
         *   * 
        *****
*/
