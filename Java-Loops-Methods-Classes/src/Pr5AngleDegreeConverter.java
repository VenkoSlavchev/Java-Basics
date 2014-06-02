import java.awt.List;
import java.io.StreamCorruptedException;
import java.nio.file.Path;
import java.security.acl.LastOwnerException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Pr5AngleDegreeConverter {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.ROOT);
         Scanner input = new Scanner(System.in);
         System.out.println("How many numbers will you enter?");
         int n = input.nextInt();
         input.nextLine();
         String[] strings = new String[n];
         double[] numbers = new double[n];
         for (int i = 0; i < numbers.length; i++) {
                 numbers[i] = input.nextDouble();
                 strings[i] = input.next();
                 input.nextLine();
                 
         }  
         for (int j = 0; j < numbers.length; j++) {
        	 convertAngles(numbers[j], strings[j]);
		}
         
 }

 private static void convertAngles(double number, String str) {
        
         if (str.equals("deg")) {
                 number *= 0.0174532925; // degrees = radians*180/Math.PI; 
            
                 System.out.printf("%.6f rad \n",number);
         }
         if(str.equals("rad")){
                 number *= 57.2957795;//radians = degrees*Math.PI/180;
                 System.out.printf("%.6f deg \n",number);
         }
 }
}