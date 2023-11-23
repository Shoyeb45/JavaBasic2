public class Strings2 {
    public class Main{
        public static void main (String[] args){
            String sentence = "How to code in VS Editor";
        
//1.substring: it is used for extracting strings from long sentences,Format:  stringname.substring(index-starting,ending index(not inclusive))
//if we leave blank ending index ,then it will automatically choose the ending index.
//let's print code
String ss = sentence.substring(4,6);
System.out.println(ss);
 //strings are immutable

 //2.parseInt : it is used to convert string number to int number

 String number = "45" ;

 int m = Integer.parseInt(number);
    System.out.println(m);

    //3.toString : it is used to convert from int to String number

    int n = 457 ;

      String Number = Integer.toString(n);
      System.out.println(Number);
}
    }
}
