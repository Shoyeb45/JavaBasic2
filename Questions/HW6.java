//function to calculate circumference of cirle upon entering radius.
import java.util.*;

public class HW6 {
     public static double Circu(double r){
        final double π = 3.14159265359 ;
        double m=2*π*r;
    return m; }    
     public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius:");     double r=sc.nextDouble();
        sc.close();
    
    System.out.print("Circumference of circle is:"+Circu(r));   
}
     }
}
