//Programme to find a number is power of 2 or not

import java.util.*;

public class HW21 {
    public class Main{
        public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    System.out.print("Enter number to find is it power of 2 or not:") ;
    int n = sc.nextInt();
      
      int m=1;
         for(int i=1 ;i<31 ; i++){
            m= 2*m;
            if(m == n){
                System.out.println("Number is power of 2");
                break;
            }
        }
        if(n != m){
        System.out.println("Number is not power of 2");
        }
sc.close();

        }
    }
    
}
