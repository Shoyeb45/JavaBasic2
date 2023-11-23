//Counting number of bit '1s' in given number 

import java.util.*;

public class HW23 {
    public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any number : ");
int n = sc.nextInt();
int count = 0;
for (int i = 0 ; i<32 ; i++){
    if(((1<<i) & n ) > 0){
        count++;
       
    }
}
System.out.print(count);
sc.close();
        }
    }
}
