import java.util.Scanner;
import java.text.DecimalFormat;
public class Array{
  public static void main (String args []){

    Scanner s = new Scanner (System.in);
    int gross = 0, A, B, C, D, E, F, G, H, I, m=0;
    double weekBonus, weekTotal, Es = 0;
    char ask;
    int payRanges [] = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
    int counter [] = {A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, I = 0};
    char type[] = { 'A','B','C','D','E','F','G','H','I'};
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("-------TRYING SIMULATION-------");

    do{
	try{
    m++;
    System.out.print("Employee " + m + " Gross: ");
    Es = Double.parseDouble(s.next());
    if (Es >= 0 && Es < 100000){
	System.out.println("Week Gross " + m + " : " + df.format(Es));
	weekBonus = Es * 0.09;
	System.out.println("Week Bonus " + m + " : " + df.format(weekBonus));
	weekTotal = weekBonus + 200;
	System.out.println("Week Total " + m + " : " + df.format(weekTotal));
	if (weekTotal >= payRanges [0] && weekTotal < payRanges [1]){
	  A++;
	  counter[0] = A;
	  System.out.println("Classification " + m + " : " + type [0]);
	}else if (weekTotal >= payRanges [1] && weekTotal < payRanges [2]){
	  B++;
	  counter [1] = B;
	  System.out.println("Classification " + m + " : " + type [1]);
	}else if (weekTotal >= payRanges [2] && weekTotal < payRanges [3]){
	  C++;
	  counter [2] = C;
	  System.out.println("Classification " + m + " : " + type [2]);
	}else if (weekTotal >= payRanges [3] && weekTotal < payRanges [4]){
	  D++;
	  counter [3] = D;
	  System.out.println("Classification " + m + " : " + type [3]);
	}else if (weekTotal >= payRanges [4] && weekTotal < payRanges [5]){
	  E++;
	  counter [4] = E;
	  System.out.println("Classification " + m + " : " + type [4]);
	}else if (weekTotal >= payRanges [5] && weekTotal < payRanges [6]){
	  F++;
	  counter [5] = F;
	  System.out.println("Classification " + m + " : " + type [5]);
	}else if (weekTotal >= payRanges [6] && weekTotal < payRanges [7]){
	  G++;
	  counter [6] = G;
	  System.out.println("Classification " + m + " : " + type [8]);
	}else if (weekTotal >= payRanges [7] && weekTotal < payRanges [8]){
	  H++;
	  counter [7] = H;
	  System.out.println("Classification " + m + " : " + type [7]);
	}else if (weekTotal >= payRanges [8]){
	  I++;
	  counter [8] = I;
	  System.out.println("Classification " + m + " : " + type [8]);
	}else
	  System.out.println("Error");
    }
    else{
	System.out.println("--------SIMULATION FAIL--------");
	}
    System.out.println("-------------------------------");
    }catch(NumberFormatException n){
	    System.out.println("--------SIMULATION FAIL--------");
	}
    System.out.print("Enter another Employee? [y][n]: ");
    ask = s.next().charAt(0);
    }while(ask == 'y' || ask == 'Y');
    if (ask == 'n' || ask == 'N')
	for ( int z = 0; z < counter.length; z++){
	System.out.println("There are " + counter [z] + " employees in class " + type [z] + ".");
    }
    else
	System.out.println("--------SIMULATION FAIL--------");
    }
}