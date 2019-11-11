import java.util.Scanner;
import java.text.DecimalFormat;
public class InputShape{
public static void main (String  args[]){

    String input;
    Float base, slide, height, radius, width, area;
    char ask;
    DecimalFormat df=new DecimalFormat("0.00");
    Scanner a=new Scanner(System.in);

    do{
    System.out.print("Input prescribed shape: ");
    input=a.next();

	if(input.equals("Circle")){
	    System.out.print("Enter prescribed radius: ");
	    radius=a.nextFloat();
	    area=Math.PI*(radius*radius);
	    System.out.println("The area of the circle is: " + df.format(area));

	}else if(input.equals("Rectangle")){
	    System.out.print("Enter prescribed height: ");
	    height=a.nextFloat();
	    System.out.print("Enter prescribed width: ");
	    width=a.nextFloat();
	    area=height*width;
	    System.out.println("The area of the rectancle is: " + df.format(area));

	}else if(input.equals("Triangle")){
	    System.out.print("Enter prescribed height: ");
	    height=a.nextFloat();
	    System.out.print("Enter prescribed base: ");
	    base=a.nextFloat();
	    area=height*base/2;
	    System.out.println("The area of the triangle is: " + df.format(area));

	}else if(input.equals("Square")){
	    System.out.print("Enter prescribed height: ");
	    height=a.nextFloat();
	    System.out.print("Enter prescribed width: ");
	    width=a.nextFloat();
	    area=height*width;
	    System.out.println("The area of the square is: " + df.format(area));

	}else{
		System.out.println("Invalid Input.");
	}
	System.out.print("Want to try again? [y/n] :");
	ask=a.next().charAT(0);
	}while(ask=='y'||ask=='Y');
    }
}