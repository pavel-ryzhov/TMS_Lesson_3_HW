package Register;

import Documents.Document;

/**
 * класс регистр
 */
public class Register {

    private static Document[] documents = new Document[10];
    private static int counter;

    /**
     * сохранение документа в регистре
     */
    public static void addDocument(Document document){
        documents[counter++] = document;
    }

    /**
     * предоставление информации о документе
     */
    public static String showInformation(int index){
        return documents[index].showInformation();
    }

}
