import java.util.Scanner;


public class Pr9PointsInsideTheHouse {

	public static void main(String[] args) {
Scanner	input = new Scanner(System.in);
        
	    double pointX = input.nextDouble();
	    double pointY = input.nextDouble();
	    input.nextLine();

	    boolean figure=false;
	    double ABC = Math.abs (12.5 * (8.5 - 3.5) + 22.5 * (3.5 - 8.5) + 17.5 * (8.5 - 8.5));
		double ABP = Math.abs (12.5 * (8.5 - pointY) + 22.5 * (pointY - 8.5) + pointX * (8.5 - 8.5));
		double APC = Math.abs (12.5 * (pointY - 3.5) + pointX * (3.5 - 8.5) + 17.5 * (8.5 - pointY));
		double PBC = Math.abs (pointX * (8.5 - 3.5) + 22.5 * (3.5 - pointY) + 17.5 * (pointY - 8.5));
	    
	    if ((pointX>=12.5 && pointX<=17.5)&&(pointY<=13.5 && pointY>=8.5)) {
			figure=true;
		}else if ((pointX>=20 && pointX<=22.5)&&(pointY<=13.5 && pointY>=8.5)) {
			figure=true;
		}else if (ABP + APC + PBC == ABC) {
			figure = true;
		}
	    
	    
	    if (figure) {
			System.out.println("Inside");
  		} else{
  			System.out.println("Outside");
  		  }
		}

	}


