import java.util.*;

public class BitManipulation {
    public class Main{
        public static void main(String[] args){
      Scanner sc =new Scanner(System.in);

          
//1.Get bit:For any binary number, if we want to know the position of any bit at i ,then we use this            
    int n =9 ;   //9 in binary 1001
    //we need to find bit at mth position,i.e., i=m-1
    //bit masking : 1 << i   , operation : i<<i &  n
int i = 3;
int BitMask =  1 << i ;
    if ((BitMask & n ) == 0) {
          System.out.println("The bit is zero");
    }
    else{
        System.out.println("The bit is one");
    }

//2.Set Bit :adding 1 to any ith position of binary

  n =10 ; // Binary - 1010
  i = 2;
  BitMask = 1 << i ;
 
int m= BitMask | n ;
System.out.println(m);

//3.Clear Bit : adding 0 to any ith position of binary

n = 19 ; //Binay -10011
i = 4 ;
BitMask = 1 << i ;
int Newbitmask = ~(BitMask);
m = Newbitmask & n ;
System.out.println(m);

//4.Update Bit : changing any bit to 1 or 0.

//Let's take input for this

n = 28; // Binary - 11100
   System.out.print("Which position(<4):");
i = sc.nextInt() ;
BitMask = 1 << i ;
   System.out.print("Which bit you have to set: ");
   int update = sc.nextInt();
if (update == 1) {
    m = BitMask | n ;
    System.out.println(m);
}
else{
    Newbitmask = ~(BitMask);
    m = Newbitmask & n ; 
    System.out.println(m);
}
sc.close();
        }
    }
}
