//displaying username to the user from email(input)

import java.util.*;

public class HW19 {
    public class Main{
        public static void main(String [] args){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your email Address: ");
            String email = sc.nextLine();
               String eg = "@@";
               String username = "";
                           for (int i=0 ; i <email.length() ; i++){
                if (email.charAt(i) == eg.charAt(0)){
                break;
                }
                 else{
                     username =username+ email.charAt(i);
                }

            }  
            System.out.println(username);
         



            sc.close();
        }
    }
}
