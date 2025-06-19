package FactoryMethod;

public class PDFInformeCreator extends InformeCreator{

    @Override
    public Informe crearInforme(){
            return new PDFInforme();
    }
    
}
