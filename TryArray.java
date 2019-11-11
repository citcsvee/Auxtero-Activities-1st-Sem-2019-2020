import java.util.Scanner;
public class TryArray{
	public static void main (String args []){
		Scanner a = new Scanner (System.in);
		int num [] = new int [10];
		int n, x = 0, sumNeg = 0, sumPos = 0;
		num[x] = 0;
		for(x = 0; x < num.length ; x++){
			System.out.print("Enter integer [" + x + "] = " );
		n = Integer.parseInt(a.next());
		num [x] = n;
		if (num [x] < 0)
			sumNeg += num [x];
		else
			sumPos += num [x];
		}
		System.out.println("List of negative integers: ");
		for(x = 0; x < num.length ; x++){
			if (num [x] < 0)
				System.out.println(num[x]);
		}
		System.out.println("The sum of the negative integers is " + sumNeg);
		System.out.println("The sum of the positibe integers is " + sumPos);
		}
}