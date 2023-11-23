//Printing the spiral order matrix as output fot given matrix.
import java.util.*;

public class HW15 {
    public class Main{
        public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
            
          System.out.print("Enter number of rows:");   int n = sc.nextInt();
            System.out.print("Enter number of columns:");   int m = sc.nextInt();

            int[][] Matrix = new int[n][m];
      
        for(int i=0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                System.out.print("Enter number in ");  System.out.print("row "+(i+1));  System.out.print(" & in column "+(j+1));  System.out.print(" :");  
                Matrix[i][j] =sc.nextInt();
            }
        }    
        sc.close();
System.out.println("Your Entered Matrix:");
    for(int i=0 ; i <n ; i++){
        for(int j =0 ; j<m ; j++){
            System.out.print(Matrix[i][j] + " ");
        }
        System.out.println();
    }

        //now we'll print spiral order.
System.out.println("Spiral order of given matrix:");
        int rowStart =0 , rowEnd =n-1 , colStart = 0 , colEnd=m-1 ;

    while(rowStart <=rowEnd && colStart<= colEnd ){

        //first line ,i.e., (1,j)
        for( int j=colStart; j<=colEnd ; j++ ){
            System.out.print(Matrix[rowStart][j] + " ");
        }
        rowStart++;   //for coming rounds (each time the cycle will repeat 1 will get added) 

        //Second line,i.e., (i,m-1)
        for(int i=rowStart ; i <=rowEnd; i++){
            System.out.print(Matrix[i][colEnd] + " ");
        }
        colEnd--;    // for coming rounds (Each time cycle will repeat 1 will get subtracted)

        //Third line i.e.,(n-1,j)
        for(int j =colEnd ;j>=colStart ; j--){
            System.out.print(Matrix[rowEnd][j] + " ");
        }
        rowEnd--;   // Same as above
        //Last Line i.e., (i,1)
        for(int i=rowEnd ; i>=rowStart ; i-- ){
            System.out.print( Matrix[i][colStart]+ " ");
        }
        colStart++;   //Same as above
    }

        }
    }
    
}
