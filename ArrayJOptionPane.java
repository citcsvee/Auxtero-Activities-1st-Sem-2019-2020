import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ArrayJOptionPane{
  public static void main (String args []){

    String Gross;
    int x = 0, A, B, C, D, E, F, G, H, I;
    double weekBonus, weekTotal, Salary = 0;
    char ask;
    int payRanges [] = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
    int classificationLabels [] = {A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0};
    char type[] = { 'A','B','C','D','E','F','G','H','I'};
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("-------TRYING SIMULATION-------");

    do{
	try{
    x++;
    Gross = JOptionPane.showInputDialog("Employee " + x + " Gross: ");
    Salary = Double.parseDouble(Gross);
    if (Salary >= 0 && Salary <= 100000){
	System.out.println("Week Gross " + x + ": " + df.format(Salary));
	weekBonus = Salary * 0.09;
	System.out.println("Week Bonus " + x + ": " + df.format(weekBonus));
	weekTotal = weekBonus + 200;
	System.out.println("Week Total " + x + ": " + df.format(weekTotal));
	if (weekTotal >= payRanges [0] && weekTotal < payRanges [1]){
	  A++;
	  classificationLabels[0] = A;
	  System.out.println("Classification " + x + " : " + type [0]);
	}else if (weekTotal >= payRanges [1] && weekTotal < payRanges [2]){
	  B++;
	  classificationLabels [1] = B;
	  System.out.println("Classification " + x + " : " + type [1]);
	}else if (weekTotal >= payRanges [2] && weekTotal < payRanges [3]){
	  C++;
	  classificationLabels [2] = C;
	  System.out.println("Classification " + x + " : " + type [2]);
	}else if (weekTotal >= payRanges [3] && weekTotal < payRanges [4]){
	  D++;
	  classificationLabels [3] = D;
	  System.out.println("Classification " + x + " : " + type [3]);
	}else if (weekTotal >= payRanges [4] && weekTotal < payRanges [5]){
	  E++;
	  classificationLabels [4] = E;
	  System.out.println("Classification " + x + " : " + type [4]);
	}else if (weekTotal >= payRanges [5] && weekTotal < payRanges [6]){
	  F++;
	  classificationLabels [5] = F;
	  System.out.println("Classification " + x + " : " + type [5]);
	}else if (weekTotal >= payRanges [6] && weekTotal < payRanges [7]){
	  G++;
	  classificationLabels [6] = G;
	  System.out.println("Classification " + x + " : " + type [6]);
	}else if (weekTotal >= payRanges [7] && weekTotal < payRanges [8]){
	  H++;
	  classificationLabels [7] = H;
	  System.out.println("Classification " + x + " : " + type [7]);
	}else if (weekTotal >= payRanges [8]){
	  I++;
	  classificationLabels [8] = I;
	  System.out.println("Classification " + x + " : " + type [8]);
	}else
	  System.out.println("Error");
    }
    else
	System.out.println("--------SIMULATION FAIL--------");
    System.out.println("-------------------------------");
    }catch(NumberFormatException n){
	    System.out.println("--------SIMULATION FAIL--------");
	}
    ask = JOptionPane.showInputDialog("Enter another Employee? \t\n[y]YES:\t\n[n]NO: ").charAt(0);
    }while(ask == 'y' || ask == 'Y');
    if (ask == 'n' || ask == 'N')
	for ( int y = 0; y < classificationLabels.length; y++){
	System.out.println("There are " + classificationLabels [y] + " employees in class " + type [y] + ".");
    }
    else
	System.out.println("--------SIMULATION FAIL--------");
    }
}