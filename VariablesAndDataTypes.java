public class VariablesAndDataTypes {
  public static void main ( String args []) {
  
    String temp = ( "The temperature in Baguio City has warmed throughout the years.");
    double TempNoon = 23.5f ;
    float TempDawn = 16.0f ;
    char a = 'A';
    int months = 12, weeks = 4, days = 7;
    byte hours = 24;
    boolean weather = true;
    if( weather ){
    System.out.print(temp + "\n\t" + a + " recent news article stated that the City has been averaging " 
                     + TempDawn + " at dawn and " + TempNoon + " at noon." + "\n\t\tRegardless, lowlanders still feel cold " 
                     + hours + " hours a day, " + days + " days a week," + weeks + " weeks per month and " + months + "months each year." );

    }else{
      System.out.println("boolean was changed to a False value.");
    
     
    }
   }
  }
