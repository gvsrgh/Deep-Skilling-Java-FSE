package DocumentFactory;
//Concrete factory for word document

import Document.Document;
import Document.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}