//Printing combined length of all strings from array input

import java.util.*;

public class HW17 {
    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("How many numbers you want to enter: ");
     int n = sc.nextInt();

    String[] Name = new String[n];
        for( int i = 0 ; i < Name.length ; i++){
            System.out.print("Enter name " + (i+1) + " :");
               Name[i] = sc.next(); 
        } 
        sc.close();
        int m = 0;
    for(int i =0; i<n ;i++){
            m=m+Name[i].length();
        }
        System.out.println(m);


    
    }
}
}