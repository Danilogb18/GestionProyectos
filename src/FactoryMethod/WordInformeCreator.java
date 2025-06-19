package FactoryMethod;

public class WordInformeCreator extends InformeCreator{

    @Override
    public Informe crearInforme(){
        return new WordInforme();
    }
    
}
