//Functions which returns the greater number

import java.util.*;
public class HW5 {
    public static float Compare(float n,float m){
        if(n>m){
            return n;
        }
        else{
            return m;
        }

}    
    public class Main{}
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);    
            System.out.print("Enter number 'n':");
        float n=sc.nextFloat();
             System.out.print("Enter number 'm':");
       float m=sc.nextFloat();      
        sc.close();
               float s=Compare(n,m);
    System.out.print("Greater number is:")  ;
    System.out.print(s);
        } 
    }

