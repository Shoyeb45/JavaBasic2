//Reverse the characters from string
import java.util.*;

public class HW20 {
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
              System.out.print("Enter any word: ");
            String word = sc.nextLine();

//Method-1:

    System.out.println("Your entered word is: " + word);

                     String reverse ="";
            for(int i = word.length()-1  ; i>=0 ; i--){
                   reverse =reverse+ word.charAt(i);
            }
         System.out.println(reverse);

//Method-2:Using StringBuilder      
 //Idea is to use the only half of charater ,we'll place first half of character at last and simulataneously at remaining place of first half we'll replace it with later half. 
 //first defining string builder:
        System.out.print("Enter Your name:");
    StringBuilder name = new StringBuilder(sc.next());

          for (int i=0 ; i<name.length()/2 ; i++){       //if number of characters are odd then it is already taken care.
            int front = i;
            int back = name.length()-i-1; //For Later indices
            
            //defining characters for changing the places.

            char frontChar = name.charAt(front);
            char backChar  = name.charAt(back);

            //Now changing characters by using setCharAt(,) , command
            
            name.setCharAt(front, backChar);  //replacing front indices with back character
            name.setCharAt(back, frontChar);  //replacing back indices with front character
        
        }
       System.out.println("Reverse of your name: " + name);
  sc.close();
        }
    }
}
