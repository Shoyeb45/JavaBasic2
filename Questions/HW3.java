//Avgerage of three numbers 

import java.util.*;

public class HW3 {
    public static float Aveg(float n,float m,float o){
        float c = (n+m+o)/3;
    return c;
}
public class Main{
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter three numbers:");
     float n=s.nextFloat(); 
     float m=s.nextFloat(); 
     float o=s.nextFloat(); 
s.close();
System.out.println("Average of three number:");
        float c=Aveg(n,m,o);
    System.out.println(c);
    }
}
    
}
