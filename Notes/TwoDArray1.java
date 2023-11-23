//Taking inputs and giving output
import java.util.*;

public class TwoDArray1 {
    public class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows:");   int n = sc.nextInt();
            System.out.print("Enter number of columns:");   int m = sc.nextInt();
        
            //defining 2D array:
        
    int[][]  matrix = new int[n][m];     //remeber zeroth indexing.So location of any cell will be (n-1,m-1).
            //Taking input(We'll use nested loops for locating each cell)
        for(int i = 0; i<n ; i++ ){
            for(int j=0 ; j<m ; j++){
                System.out.print("Enter number in "); 
                 System.out.print("row "+(i+1));
                   System.out.print(" & in column "+(j+1));
                     System.out.print(" :");  
                matrix[i][j] = sc.nextInt() ;
            }
                   }

        //For printing 2D array

        for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
sc.close();
        }
    }
}
