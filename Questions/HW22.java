//Toggle a bit a position(input by user)

import java.util.*;

public class HW22 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int n = 15 ; //1111 in binary
              System.out.print("Enter the index of bit: " );
              int i = sc.nextInt();

            int BitMask = 1 << i ; 
             //Here we'll use XOR Operation
               System.out.print("After toggling ith bit: " + (BitMask ^ n));

               sc.close();
        }
    }
}
