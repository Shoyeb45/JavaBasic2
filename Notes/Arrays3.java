//Taking an array as input and searching for number x(given by user)
import java.util.*;
public class Arrays3 {
    public class Main{
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
System.out.print("Enter number for array size:");   int n=sc.nextInt();

int[] Marks= new int[n];

for(int i=0 ; i<n ;i++){
    System.out.print("Enter Marks in Subject-"+(i+1) + " :") ;
   Marks[i]=sc.nextInt();
}

System.out.print("Enter number 'x' to find index of 'x':");
int x= sc.nextInt();
//Marks.length == size of Marks array.
for(int i=0;i<Marks.length ;i++ ){
    if(x == Marks[i]){
        System.out.print("Index of "+x+" is: "+i);
    }
}
     sc.close();
        }
   }
}
