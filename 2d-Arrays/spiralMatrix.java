

public class spiralMatrix {
    public static void SpiralMatrix(int matrix[][]){
        int startRow =0 , endRow = matrix.length-1;
        int startCol = 0 , endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i =startCol ;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            startRow++;
            for(int i =startRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            endCol--;
            
                for(int i =endCol;i>=startCol;i--){
                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(matrix[endRow][i]+" ");
                }
                
                
                endRow--;
               
                    for(int i =endRow;i>=startRow;i--){
                        if(startCol== endCol){
                            break;
                        }
                        System.out.print(matrix[i][startCol]+" ");
                        }
                        startCol++;
                 
                        
                        
            }
            System.out.println();
        } 
        public static void main(String[] args) {
            int matrix[][] = {{1,2,3,},{4,5,6},{7,8,9},{10,11,12}};
           SpiralMatrix(matrix);
        
        }
    }

