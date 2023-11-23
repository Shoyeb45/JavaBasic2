//Making a functon to add 2 numbers(input by user).
  import java.util.*;

public class Functions2 {
     public static int CalculateSum (int a, int b){
         int sum = a+b;
    return sum;
}
    
public class Main{
        public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

System.out.println("Enter numbers");
         
         System.out.print("Enter number 'a': ");      int a = sc.nextInt();
         System.out.print("Enter number 'b': ");      int b = sc.nextInt();
    int sum = CalculateSum(a, b)  ; 
        System.out.println(sum);
         sc.close();
}    
   }
}
