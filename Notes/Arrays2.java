//Taking input for array size and data entry.

import java.util.*;

public class Arrays2 {
   public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
System.out.print("Enter number for size:");    int n=sc.nextInt();
   //input for decalaration of strings.  
  int[] numbers = new int[n];

  //for taking inputs inside array:

  for(int i=0; i<n ;i++){
    System.out.print("Enter data entry"+(i+1)+" :");
    numbers[i]=sc.nextInt();
  }
System.out.println("Data Entry:");
  for(int i=0; i<n ;i++){
    System.out.println(numbers[i]);
  }

sc.close();
    }
   }   
}
