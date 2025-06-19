package DocumentFactory;
//Concrete factory class for Excel Document

import Document.Document;
import Document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }
}
