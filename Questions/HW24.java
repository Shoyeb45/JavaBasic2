//Converting Binary number System to Decimal Number System and vice-versa. 

import java.util.*;

public class HW24 {
    public class Main{
        public static void main(String[] args){
            //First From Binary to Decimal
            //We'll use parseInt(String,radix),Radix will be base 
    Scanner sc =new Scanner (System.in);      
          System.out.print("Enter Number to convert Binary to Decimal(Enter only 0 or 1):");  
        String BinaryToDecimal = sc.next(); 
          System.out.print("Decimal of Entered Binary Number: ");
        int m = Integer.parseInt(BinaryToDecimal , 2);
        System.out.println(m);
        

        //Decimal to Binary,

            System.out.print("Enter Number to convert  Decimal to Binary (Enter only natural number):");  
               String DecimalToBinary = sc.next();
                m = Integer.parseInt(DecimalToBinary);
                   System.out.println("Binary of Entered Decimal Number: "+Integer.toBinaryString(m)); 

         sc.close();         
}
    }
}
