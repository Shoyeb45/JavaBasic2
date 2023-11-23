//To use Array

public class Arrays1 {
    public class Main{
        public static void main(String[] args){
            //Use of arrays- to make list of any data types,come in handy when we have many data types
//Use by syntax.

    int [] marks =new int[3];   //zero indexing is used i.e., data variable from 0 to (input size - 1)

// we can also use this syntax as:    int marks[] = new int [3];       (Square brackets can be arranged later also)

//Giving variable a value    
    marks[0]=98;  //subj-1
    marks[1]=95;  //subj-2
    marks[2]=60;  //subj-3

    //Printing

System.out.println(marks[0]);    
System.out.println(marks[1]);       
System.out.println(marks[2]);  

//For printing more than 100 input we can use loop ,like:
       System.out.println("Second way to print"); 
for(int i=0;i<3 ; i++){
    System.out.println(marks[i]); 
}

//Second way to define array 
System.out.println();
int Age[]={19,18,17,16};  //(1st entry will be in oth index and so on )

for(int i=0;i<4 ; i++){
    System.out.println(Age[i]); 
}

}
    }
    
}
