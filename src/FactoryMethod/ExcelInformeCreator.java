package FactoryMethod;

public class ExcelInformeCreator extends InformeCreator {

    @Override
    public Informe crearInforme() {
        return new ExcelInforme();
    }

}
