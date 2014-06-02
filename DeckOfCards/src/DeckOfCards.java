		import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;





public class DeckOfCards {


			public static void main(String[] args)  throws Exception  {

				Document document = new Document();
				try {
					PdfWriter.getInstance(document, new FileOutputStream("DeckofCards.pdf"));
				 
				BaseFont baseFont = BaseFont.createFont("Arial.ttf", BaseFont.IDENTITY_H, true);
		        Font black = new Font(baseFont, 80f, 0, BaseColor.BLACK);
		        Font red = new Font(baseFont, 80f, 0, BaseColor.RED);
		        
		        PdfPTable t = new PdfPTable(2);
		        t.setSpacingBefore(10);       
		        t.setSpacingAfter(10);
		        
		        
		        t.setWidthPercentage(80);
		        t.getDefaultCell().setFixedHeight(180);
		        
				
		        document.open();
				 String cards;
				 char colour;
				 for (int i = 2; i <= 14; i++) {
		            switch (i) {
		            case 10: cards = "10"; break;
		            case 11: cards = "J"; break;
		            case 12: cards = "Q"; break;
		            case 13: cards = "K"; break;
		            case 14: cards = "A"; break;
		            default: cards = " " + i; break;
		            }
		            for (int j = 1; j <= 4; j++) {
		                    switch (j) {
		                    case 1: colour = '\u2663'; t.addCell(new Paragraph(cards + colour + " ", black)); break;
		                    case 2: colour = '\u2666'; t.addCell(new Paragraph(cards + colour + " ", red)); break;
		                    case 3: colour = '\u2660'; t.addCell(new Paragraph(cards + colour + " ", black)); break;
		                    case 4: colour = '\u2665'; t.addCell(new Paragraph(cards + colour + " ", red)); break;
		                    }
		            }
		    }
		         
		        document.add(t);
				document.close();
		                
				}
				catch (FileNotFoundException e) {
				
					e.printStackTrace();
				} catch (DocumentException e) {
			
					e.printStackTrace();
				}
				
				
				
				

			
				
						
			}

		}
