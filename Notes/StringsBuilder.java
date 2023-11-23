//Use of Strings builder  

public class StringsBuilder{
    public class Main{
        public static void main(String[] args){

            //Declaration 
              
            StringBuilder word = new StringBuilder("Shoyeb Ansari") ;
                 System.out.println(word);

            //Functions:

//1.charAt(): (same zero indexing)
                 System.out.println(word.charAt(0));

//2..Length() :
                 System.out.println(word.length());               
                     
//3.setCharAt(index,char) : Used to replace another character at any index.
               //like I need to replace i at 2nd index ,then:
                word.setCharAt(2,'i');
                 System.out.println(word);  

//4.insert(index,char) : insert any character at any index
              //I need to insert character 'a' in 2nd index ,then
                word.insert(2 , 'a');
                 System.out.println(word);

//5.delete(start index, end index) : Delete character from any index(End index is exclusive)
              //I need to delete character 's' from 10th index,then:
                word.delete(10, 11);
                 System.out.println(word); 
                 
//6.append(" ") : To add something at the end.                 
              //I need to add 'Ansari' at the end of new created string,then:
            StringBuilder name =new StringBuilder("Shoyeb") ; 
                 name.append(" Ansari");
                  System.out.println(name);
 
        }
    }
}