package Document;
//Concreate document for PdfDocument

public class PdfDocument implements Document{
    public void open() {
        System.out.println("Pdf document is getting opened...");
    }
}