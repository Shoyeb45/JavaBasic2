//replacing 'e' with 'i' in string (input from user)

import java.util.*;

public class HW18 {
    public class Main{
        public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter any word:");
String str = sc.nextLine();
     //now replacing e with i in String.So first we have to identify e 
String replace = " ";

String name = "eeee";

for (int i= 0 ;i<str.length() ; i++){
    //can't compare string to character ,that's why roundabout way of comparing things
    if ( str.charAt(i) == name.charAt(0) ){
        replace += "i";
    }
    else{
        replace += str.charAt(i);    
    }
}
System.out.println(replace);
sc.close();

//Let's solve this by StringBuilder.

StringBuilder word = new StringBuilder(str);

//for replacing 'e' with 'i',first we need to find indices of 'e',then replacing it with 'i' by setCharAt(); 

for (int i=0 ; i<word.length() ; i++){
    if (word.charAt(i) == name.charAt(0)){
        word.setCharAt(i , 'i');
    }
}
System.out.println(word);
   

        }
    }
}
