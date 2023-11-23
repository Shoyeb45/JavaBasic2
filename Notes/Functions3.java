//function for multiplying
import java.util.*;

public class Functions3 {
    public static int CalculateMult(int a,int b){
        int mult = a*b;
    return mult;
    }  
         public class Main{
            public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 'a':");     int a =sc.nextInt();
System.out.print("Enter number 'b':");     int b =sc.nextInt();

     int mult=CalculateMult(a,b);
System.out.print("Multiplication of numbers is:"+ mult);          

  sc.close();
        }
}

}
