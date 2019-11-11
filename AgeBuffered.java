//BufferedReader
import java.io.*;
public class AgeBuffered{
public static void main (String args [])throws IOException{
    //class instantation
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    int age;
   
    do{
    	System.out.println("Type your age: ");
    	age = Integer.parseInt(b.readLine());
    	if (age>=0 && age<=3)
        System.out.println("Baby");
    	else if (age >= 4 && age <=12)
        	System.out.println("Child");
      
    else if (age >= 13 && age <=19)
        System.out.println("Teen");
      
    else if (age >= 20 && age <=32)
        System.out.println("Young Adult");
      
    else if (age >= 33 && age <=45)
        System.out.println("Middle Aged");
      
    else if (age >= 46 && age <= 59)
      
        System.out.println("Adult");
      
    else if (age >= 60 && age <= 122)
        System.out.println("Senior");
      
    else 
        System.out.println ("invalid output");    
    
   }while (age<0||age<=122);
   }
}