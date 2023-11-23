//Checking array of integers are in ascending order or not.

import java.util.*;

public class HW14 {
    public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
                System.out.print("How many integers you want to enter?");   
                  int n =sc.nextInt();
        int[] Numbers = new int[n];
          for(int i=0 ; i<n ; i++){
            System.out.print("Enter Number" + (i+1) + " :");

               Numbers[i] = sc.nextInt();
            }
  boolean iA = true;
        for(int i=0 ; i<(n-1) ; i++){
            if(Numbers[i] > Numbers[i+1]) {
                iA = false;
            }
                } 
           
            if(iA){
                System.out.print("Arrays of integers are sorted in ascending order.");
            }
            else{
                System.out.print("Arrays of integers are not in ascending order.");
            }
            
        sc.close();    
        }
      }
    }

