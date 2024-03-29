import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
public class Pr9Product {
	 public static void main(String args[]) {

	 Locale.setDefault(Locale.ROOT);
    File file = new File("input.txt");
    ArrayList<Product> products = new ArrayList<Product>();
    try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                    products.add(new Product(sc.next(), sc.nextDouble()));
            }
    } catch (FileNotFoundException e) {
            System.out.println("Error");
    }
   
    Collections.sort(products);
    try {
            PrintWriter pw = new PrintWriter (new File("output.txt"));
            for (Product product : products) {
                    pw.println(product.toString());
            }
            pw.close();
    } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
   
}



}
 class Product implements Comparable <Product>{
private String name;
double price;
Product (String name, double price) {
    this.name = name;
    this.price = price;
}
@Override
public String toString() {
    DecimalFormat formatter = new DecimalFormat("#0.00");
    return formatter.format(this.price) + " " + this.name;
}
@Override
public int compareTo(Product arg) {
    if(this.price < arg.price)
            return -1;
    else if (this.price > arg.price)
            return 1;
    return 0;
}
@Override
public boolean equals(Object obj) {
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        Product other = (Product) obj;
        if (name == null) {
                if (other.name != null)
                        return false;
        } else if (!name.equals(other.name))
                return false;
        return true;
}
public double getPrice() {
	
	return this.price;
}


}


