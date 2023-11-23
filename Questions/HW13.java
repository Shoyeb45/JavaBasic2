//Finding Maximum and Minimum Number in Array of integer

import java.util.*;

public class HW13 {
  public class Main{
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
          System.out.print("Enter how many Integers you want to enter:");
            int n=sc.nextInt();
              int[] integers = new int[n];
               for(int i=0 ; i<n ; i++){
                System.out.print("Enter integer" + (i+1) + " :");   integers[i]=sc.nextInt();
               }
int max = Integer.MIN_VALUE;  //Min. Value = -2147483648    // Constants defined in java programme no integerss can greater than maximum value and no integre can be less than minimum value.
int min = Integer.MAX_VALUE;  //Max. Value =  2147483647
  for(int i=0 ; i < n ; i++ ) {
    if(integers[i] > max ){
      max = integers[i];
    }
    if(integers[i] < min){
      min = integers[i];
      }
    }
System.out.println("Maximum Integer in array:" + max);
  System.out.println("Minimun Integer in array:" + min);
    sc.close();
    }
  }  
}
