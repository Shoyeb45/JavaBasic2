//Printing Name
import java.util.*;
public class Functions1 {
    public static void PrintMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
    String name= sc.next();    
 
          PrintMyName(name);

   sc.close(); }
}
