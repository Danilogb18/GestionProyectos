package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        InformeCreator pdfC = new PDFInformeCreator();
        pdfC.generate();

        InformeCreator wordC = new WordInformeCreator();
        wordC.generate();

        InformeCreator excelC = new ExcelInformeCreator();
        excelC.generate();
        
    }

}
