import java.util.Scanner;
import java.text.DecimalFormat;
public class InputShapes{
public static void main (String args []){
  
  	String input;
    double base, slide, height, radius, width, area, side;
    char ask;
    DecimalFormat df=new DecimalFormat("0.00");
    Scanner a=new Scanner(System.in);
  
  	do{
    	System.out.println("Input the prescribed shape therefore: " + "\n Choose among these shapes :" + "\n\t Triangle" + " \n\t Circle " + " \n\t Square " + " \n\t Rectangle");
    	input=a.next();
    
    	if(input.equals("circle")||input.equals("CIRCLE")||input.equals("Circle")){
       	  	 System.out.print("Enter prescribed radius: ");
       		 radius=a.nextDouble();
       		 area=(Math.PI*(radius*radius));
       		 System.out.println("The area of the circle is approximately: " + df.format(area));
        
      	}else if(input.equals("rectangle")||input.equals("RECTANGLE")||input.equals("Rectangle")){
       		 System.out.print("Enter prescribed height: ");
        	 height=a.nextDouble();
        	 System.out.print("Enter prescribed width: ");
        	 width=a.nextDouble();
        	 area=height*width;
        	 System.out.println("The area of the rectangle is approximately: " + df.format(area));
        
        }else if(input.equals("square")||input.equals("SQUARE")||input.equals("Square")){
       	 	 System.out.print("Enter prescribed side: ");
        	 side=a.nextDouble();
  			 area=side*2;
        	 System.out.println("The area of the square is approximately: " + df.format(area));
        
      	}else if(input.equals("triangle")||input.equals("TRIANGLE")||input.equals("Triangle")){
        	 System.out.print("Enter prescribed height: ");
        	 height=a.nextDouble();
        	 System.out.print("Enter prescribed base: ");
        	 base=a.nextDouble();
        	 area=((height*base)/2);
        	 System.out.println("The area of the triangle is approximately: " + df.format(area));
        
        }else{
        	 System.out.println("Invalid input. Please try again.");
      		 }
        	 System.out.print("Do you want to try again? [y/n] :");
        	 ask=a.next().charAt(0);
     
        }while(ask=='y'||ask=='Y');
	}    
}