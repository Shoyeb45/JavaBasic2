//Basic use of string

import java.util.*;

public class Strings1 {
    public class Main{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);

            //'next' is used for only one token  , 'nextLine' is used for more than  word.
            String FirstName = sc.next();
            String LastName  = sc.next();
            System.out.println("Your name is " +FirstName);


//Now these we know already,so let's check some of the functions of Strings which is useful

//1.Concatenation: used  for merging different types of string

   String FullName = FirstName +" "+ LastName;     //" " it is also a string without defining
   System.out.println("Your full name is "+FullName);

//2.Length: Used to find how many character are there in given string,Eg,
System.out.println("Number of character in your FullName " +(FullName.length()-1));   //length will also include the space


//3.charAt: For printing all characters in given string(Zero indexing)
System.out.print("Which character you want in your full name:");
int n =sc.nextInt();
System.out.println(FullName.charAt(n));
  //we can also use for loop to print all characters,here:

  for(int i=0 ; i<FullName.length() ; i++){
    System.out.print(FullName.charAt(i)+ " ");
  }  
  System.out.println();
sc.close();


//4.compareTo: it compares the strings(yes,we can Compare the Strings),Ex.,
System.out.println("Compare output:");
System.out.println(FirstName.compareTo(LastName));
    
    //Now there are 3 outputs are possible:
    // 1.if FirstName and LasttName are equal - 0
    // 2. if FirstName is greater than LasttName - +ve integer
    // 3. if FirstName is less than LasttName - -ve integer.
// "==" can be used for equality of string without compareTo function,but sometime it fails.Let's check.Like,FirstName == LastName

if (FirstName.compareTo(LastName) == 0){
    System.out.println("Both Names are equal");
}
else{
    System.out.println("Both name are not equal");
}



} 
    }
}
