//Factory Method to test
import Document.Document;
import DocumentFactory.DocumentFactory;
import DocumentFactory.ExcelDocumentFactory;
import DocumentFactory.PdfDocumentFactory;
import DocumentFactory.WordDocumentFactory;

public class FactoryMethodTest {
    public static void main(String[] args){
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}