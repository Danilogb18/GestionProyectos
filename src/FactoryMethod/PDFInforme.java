package FactoryMethod;

public class PDFInforme implements Informe{
    @Override
    public void generate() {
        System.out.println("Generando reporte en formato PDF...");
    }
}
