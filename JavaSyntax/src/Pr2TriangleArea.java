import java.util.Scanner;


public class Pr2TriangleArea {

	public static void main(String[] args) {
		Scanner	input = new Scanner(System.in);
        
	    double point1x = input.nextInt();
	    double point1y = input.nextInt();
	    double point2x = input.nextInt();
	    double point2y = input.nextInt();
	    double point3x = input.nextInt();
	    double point3y = input.nextInt();
	    input.nextLine();
	

	 if((point1x==point1y)&&(point2x==point2y)&&(point3x==point3y)){
		System.out.println("0");
	 } else{
		double area = Math.abs((((point1x*(point2y-point3y))+(point2x*(point3y-point1y))+(point3x*(point1y-point2y))))/2);		
		System.out.println((int)(area));
		}
	}
}
