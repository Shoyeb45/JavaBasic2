//Transposing of given matrix.

import java.util.*;

public class HW16{
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter row number: ");   int n =sc.nextInt();
            System.out.print("Enter column number: ");  int m= sc.nextInt();

               int[][] Matrix1=new int[n][m];

                for( int i =0 ;i<n ;i++) {
                    for( int j=0 ; j<m ; j++){
                        System.out.print("Enter number in ");  System.out.print("row "+(i+1));  System.out.print(" & in column "+(j+1));  System.out.print(" :"); 
                        Matrix1[i][j] = sc.nextInt();
                    }

                       }

                      sc.close();
                    
                    System.out.println("Your Entered Matrix:");
        for(int i=0 ; i <n ; i++){
            for(int j =0 ; j<m ; j++){
            System.out.print(Matrix1[i][j] + " ");
        }
        System.out.println();
    }
               
               System.out.println("Transpose Matrix:");

int[][] Matrix2 = new int[m][n];
           for(int i=0 ; i <m ; i++){
            for(int j=0 ; j<n ; j++){
                Matrix2[i][j]=Matrix1[j][i];
            }
           }     

               for( int i=0 ; i<m ; i++){
                for(int j=0 ; j<n ; j++ ){
                    System.out.print(Matrix2[i][j] + " ");
                }
                System.out.println();
               }
                  
                
        }
    }
}