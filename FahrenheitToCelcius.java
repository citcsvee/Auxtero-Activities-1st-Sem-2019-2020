//Scanner
import java.util.Scanner;
public class FahrenheitToCelcius {
  public static void main (String args []){
  
  Scanner x = new Scanner(System.in);
  double input, celcius;
  
  System.out.println("Enter Temp in F");
  input = x.nextDouble();
  celcius = (input - 32) * 5/9;
  System.out.println("F: " + input + "\nc: " + celcius);
  }
 }
  