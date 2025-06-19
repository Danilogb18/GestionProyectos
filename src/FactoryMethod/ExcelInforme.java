package FactoryMethod;

public class ExcelInforme implements Informe{
    @Override
    public void generate() {
        System.out.println("Generando reporte en formato Excel...");
    }
    
}
