import java.util.Scanner;
public class EnterMinutesScanner{
public static void main(String args[]){
  Scanner a = new Scanner(System.in);
  long minutes,hours,mins;
  char ask;
  
  do{
  	System.out.println("Enter the prescribed minute or minutes: ");
  	minutes = a.nextLong();
  	hours = minutes/60;
  	mins = minutes%60;
  	System.out.println("There are " + hours + "hour/s and " + mins + "minute/s. ");
  
  	System.out.print("Do you want to try again? [y/n] :");
  	ask=a.next().charAt(0);
  }while(ask=='y'||ask=='Y');
  }
} 