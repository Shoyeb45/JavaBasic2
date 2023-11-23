//Function for writing greatest common divisor of 2 numbers
import java.util.*;

public class HW11 {
    public class Main{
        public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter number 'n' :");    int n=sc.nextInt();  
  System.out.print("Enter number 'm' :");    int m=sc.nextInt();
           sc.close();
           //' != ' This operator means not equal to.  
  while (n !=m){
    if(n>m){
        n=n-m;
    }
    else{
        m=m-n;
    }
   }
   System.out.println("GCD(n,m)=" + m);
   

//Second method 
int GCD=1;
  for(int i=1; i<=n && i<=m;i++){
          //Running loop till the smallest of two input number
     if(n % i==0 && m % i==0){
        //checking divisibility of till smallest of the two
    GCD=i;
     }     

  }
  System.out.print("The GCD of n & m is:"+GCD);
}
  }
}