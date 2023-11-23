//Programme to count the numbers(+ve,-ve or 0) ,user input till user wants.
import java.util.*;

public class HW8 {
    public class Main{
        public static void  main(String[] args){
            System.out.print("Press (1) to continue and press (0) to stop :");
Scanner sc=new Scanner(System.in); 
        int input =sc.nextInt();
int positive=0;  int negative=0;  int zeroes=0;
 while(input ==1){
    System.out.print("Enter your number:");    int n= sc.nextInt();
        if(n>0){
            positive++;
         }
        else if(n==0){
            zeroes++;
        } 
        else{
            negative++;
        }
         System.out.print("Press (1) to continue and press (0) to stop : ");    
      input = sc.nextInt();
 }       
   
      sc.close();
      System.out.println("Count:");
    System.out.println("number of positive number:"+positive);  
    System.out.println("number of zeroes number:"+zeroes);  
    System.out.println("number of negative number:"+negative);  
            }
    }   
}
