public class InformeDecoratorFuentes implements Informe {
    private Informe informe;

    public InformeDecoratorFuentes(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String mostrarContenido() {
        return "<fuente personalizada> " + informe.mostrarContenido() + "</fuente personalizada>";
    }
}
