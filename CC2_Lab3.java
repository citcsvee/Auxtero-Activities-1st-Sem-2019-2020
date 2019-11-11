public class CC2_Lab3 {
  public static void main (String[] args) {
    
		char a = 'V' , b = 'E' , c = 'E' , d = '!';
    byte A = a, B = b, C = c, D = d;
    
    System.out.println ("V = " + A +
                          "\nE = " + B +
                          "\nE = " + C +
                          "\n! = " + d + "\n" +
                          a + b + c + d);
    
    long sum, ave, rem, prod;
    sum = A + B + C + d;
    ave = sum/3;
    prod = A + B + C + d;
    rem = prod%ave;
    
      
    System.out.println ("Sum: " + sum +
                        "\nAverage: " + ave +
                        "\nRemainder: " + rem +
                        "\nProduct: "+ prod );
    
    }
}