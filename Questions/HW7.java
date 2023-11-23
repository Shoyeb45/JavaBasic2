//Taking age as input and telling abot they are adult or not using function.
import java.util.*;

public class HW7 {
     public static float age(float n){
        if(n>=18){
           System.out.print("You are eligible to vote");
            return n;
        }
        else{
            System.out.print("You are not eligible to vote");
            return n;
        }
}    
            public class Main{
                public static void main(String[] args){
                    Scanner sc =new Scanner(System.in);
                System.out.print("Enter Your age:");
                        float n = sc.nextFloat();    
                    sc.close();    
                        age(n);
                }
            }
     
}
