package FactoryMethod;

public class WordInforme implements Informe {
    @Override
    public void generate() {
        System.out.println("Generando reporte en formato Word...");
    }

}
