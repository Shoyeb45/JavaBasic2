//Taking input of names in array

import java.util.*;

public class HW12 {
    public class Main{
        public static void main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {
                int i;
      System.out.print("How many times you want to enter name? ");
      int n=sc.nextInt();
  
String[] Names=new String[n];
   for(i=0; i<n ;i++){
      Names[i]=sc.next();
   }
   
   for(i=0 ; i<n ; i++){
      System.out.print("Your Entered name:"+  Names[i] + " \n");
   }   
      
            }
                
            }
    }
}
