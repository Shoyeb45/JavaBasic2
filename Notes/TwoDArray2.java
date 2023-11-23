//Finding position of any given number x in 2D Array
import java.util.*;

public class TwoDArray2 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows:");   int n = sc.nextInt();
            System.out.print("Enter number of columns:");   int m = sc.nextInt();
    int[][] numbers = new int[n][m];
    
    for(int i = 0; i<n ; i++ ){
            for(int j=0 ; j<m ; j++){
                System.out.print("Enter number in ");  System.out.print("row "+(i+1));  System.out.print(" & in column "+(j+1));  System.out.print(" :");  
                numbers[i][j] = sc.nextInt() ;
            }
                   }
            System.out.print("Which number you have to find? ");  int x=sc.nextInt();

                for(int i=0 ; i<n ; i++){
                    for(int j=0 ; j<m ; j++){
                        if( x == numbers[i][j]  ){
                            System.out.print("Index of your entered number is:("+ i +", " + j + ")");
                        }
                    }
                }
                sc.close();
        }
    }
}
