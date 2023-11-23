//printing sum of odd numbers from 1 to n (Not first n natural odd number)
import java.util.*;
public class HW4 {
    public static int  SumOdd(int n){
      if(n % 2 ==0){
        //Math Calculation
        int m=n*n/4;
       return m;
      }  
      else{
        int m=(1+n)*(1+n)/2;
       return m; 
      }
      
   
    } 
         public class Main{
            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter number to get sum from 1 to that number:");
                int n=sc.nextInt();
                sc.close();
             System.out.println("Your sum:"+SumOdd(n));
               
            }
         }
}
