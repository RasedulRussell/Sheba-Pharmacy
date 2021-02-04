
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RasedulRussell
 * 
 */
public class PDFWriter {
    private ArrayList<MedicineSell> List = new ArrayList<>();

    PDFWriter(ArrayList<MedicineSell> pres) {
        List = pres;
    }
    
    public void WritePdf(String fileName, int colam) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();

        PdfPTable table = new PdfPTable(colam);
        addTableHeader(table);
        addRows(table);

        document.add(table);
        document.close();
        System.out.println("document created");
    }

    private void addTableHeader(PdfPTable table) {
        Stream.of("Medicine Name", "Quantity", "Unit Price", "Price")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });

    }

    private ArrayList<MedicineSell> GetData() {
        ArrayList<MedicineSell> data = new ArrayList<>();
        for (MedicineSell list1 : List) {
            data.add(list1);
        }
        return data;
    }

    private void addRows(PdfPTable table) {
        ArrayList<MedicineSell> list = GetData();
        for (MedicineSell item : list) {
            table.addCell(item.Name);
            table.addCell(item.UnitPrice.toString());
            table.addCell(Integer.toString(item.Quantity));
            table.addCell(item.Price.toString());
        }
    }

}
