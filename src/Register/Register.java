package Register;

import Documents.Document;

public class Register {

    private static Document[] documents = new Document[10];

    public static void addDocument(Document document, int index){
        documents[index] = document;
    }
    public static String showInformation(int index){
        return documents[index].showInformation();
    }

}
