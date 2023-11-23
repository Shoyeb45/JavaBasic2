//FUnction to print table
     import java.util.*;
public class HW2 {
    public static void Table(int n){
         
        for(int i=1;i<=10 ; i++){
         System.out.println(n*i + " ");
        }
return ;
    }
         public class Main{
            public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number:") ;    int n = sc.nextInt();
        sc.close();
         System.out.println("table:");
      Table(n);
      System.out.println();
    }
         }
    
}
