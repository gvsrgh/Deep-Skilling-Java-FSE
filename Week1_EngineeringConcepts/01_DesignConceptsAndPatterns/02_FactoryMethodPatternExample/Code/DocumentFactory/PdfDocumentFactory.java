package DocumentFactory;
//Concrete factory class for Pdf Document

import Document.Document;
import Document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }
}
