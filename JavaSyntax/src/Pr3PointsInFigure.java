import java.util.Scanner;


public class Pr3PointsInFigure {

	public static void main(String[] args) {
Scanner	input = new Scanner(System.in);
        
	    double pointX = input.nextDouble();
	    double pointY = input.nextDouble();
	    input.nextLine();
   
	    boolean figure=false;
	    
	    
	    if ((pointX>=12.5 && pointX<=17.5)&&(pointY<=13.5 && pointY>=8.5)) {
			figure=true;
		}else if((pointX>=12.5 && pointX<=22.5)&&(pointY<=8.5 && pointY>=6)){
			figure = true;
		}else if ((pointX>=20 && pointX<=22.5)&&(pointY<=13.5 && pointY>=8.5)) {
			figure=true;
		}
	    
	    if (figure) {
			System.out.println("Inside");
  		} else{
  			System.out.println("Outside");
  		  }
		}
	   
	}


