package FactoryMethod;

public abstract class InformeCreator {
    public abstract Informe crearInforme();

    public void generate(){
        Informe infort=crearInforme();
        infort.generate();
    }
}
