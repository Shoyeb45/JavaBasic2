//finding a factorial of number
import java.util.*;

public class Functions4 {
    public static int CalculateFacto(int n){

if(n < 0){
    System.out.println("Not defined");
   return n;
} 
//loop
 int facto=1;
        for(int i=n; i>=1 ; i--){
     facto = facto*i;
    }
return facto;
    }
    public class Main{
        
        public static void  main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial:");
             int n=sc.nextInt();
        int facto = CalculateFacto(n);
        System.out.print(facto);

        sc.close();
        }
  }
}
