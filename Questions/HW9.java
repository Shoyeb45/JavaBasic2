//Exponential function i.e,x raise to n

import java.util.*;
public class HW9 {
    public static int Expo(int x,int n){
        for(int i=1;i<n;i++){
            x=x*x;
        }
    return x;
    }

    public class Main{
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
            System.out.println("This programme is to find x raise to n");
        
            System.out.print("Enter number 'x':");    int x=sc.nextInt();
            System.out.print("Enter number 'n':");    int n=sc.nextInt();  
            System.out.print(Expo(x,n));
        sc.close();    
        }
    }
    
}

