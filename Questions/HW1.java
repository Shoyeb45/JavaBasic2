//function for checking even or odd number

        import java.util.*;
 
public class HW1 {
     public static int CheckNumber(int n){
         int remai = n % 2;
    return remai;
     }     
     public class Main{
        public static void main(String[] args){

            Scanner sc =new Scanner(System.in);
        System.out.print("Enter number to check even or odd:");   int n=sc.nextInt();
        sc.close();
int m = CheckNumber(n);
if( n==0 ){
    System.out.println("Neither odd nor even");
}  
else if(m==0){
    System.out.print("Your number is even");
}      
else{
    System.out.print("Your number is odd");
}        }
     }
}
