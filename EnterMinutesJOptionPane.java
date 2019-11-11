import javax.swing.JOptionPane;
public class EnterMinutesJOptionPane{
public static void main (String args []){
  long minutes,hours,mins;
  char ask;
  do{
    minutes = Long.parseLong(JOptionPane.showInputDialog("Enter the prescribe minute or minutes:"));
    hours = minutes/60;
    mins = minutes%60;
   	JOptionPane.showMessageDialog(null,"There are " + hours + " hour/s and " + mins + " minute/s. ");
   	
 
  	ask=JOptionPane.showInputDialog("Do you want to try again? [y/n] :").charAt(0);
  }while(ask=='y'||ask=='Y');
  
 } 
}
  
  
