//Fibonacci Squence upto nth term
import java.util.*;

public class HW10 {
     public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for nth term:");      int n =sc.nextInt();
             sc.close();  
    
             int Tn1=0,Tn2=1,Tn,i;
    System.out.print(Tn1+ " " +Tn2);
if(n>1){

    for( i=2; i<n ;i++){
  Tn=Tn1+Tn2; 
        System.out.print(" " + Tn);
Tn1=Tn2;    //SWapping
Tn2=Tn;
}
    System.out.println();
}           
        
    }    
     
        }
     }   
    

