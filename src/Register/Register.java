package Register;

import Documents.Document;

import java.util.Arrays;

/**
 * класс регистр
 */
public class Register implements RegisterMethods{

    private static Document[] documents = new Document[0];
    private static int counter;

    /**
     * сохранение документа в регистре
     */
    public void addDocument(Document document){
        if (counter == documents.length) {
            documents = Arrays.copyOf(documents, documents.length + 5);
        }
        documents[counter++] = document;
    }

    /**
     * предоставление информации о документе
     */
    public String showInformation(int index){
        return documents[index].showInformation();
    }

}
