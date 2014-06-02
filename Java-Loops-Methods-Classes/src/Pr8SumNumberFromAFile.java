import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Pr8SumNumberFromAFile {

	public static void main(String[] args)  {
		
		
			try {
				BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Venko\\workspace\\Java-Loops-Methods-Classes\\input.txt"));
			
		
		
				String line = null;
				int sum=0;
				while ((line = in.readLine()) != null) {
     			String[] numbers = line.split("\\s");
				 	for (int i = 0; i < numbers.length; i++) {
					int number = Integer.parseInt(numbers[i]);
					 sum +=number;
				 	}				
				System.out.println(sum); 
				}
			} catch (FileNotFoundException e) {
				
				System.out.println("Error");
				
			} catch (IOException e){
				System.out.println("Error");
				//e.printStackTrace();
			}
	}
}
		
		
	

//Problem9






