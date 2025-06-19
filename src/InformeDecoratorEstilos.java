
public class InformeDecoratorEstilos implements Informe{
    private Informe informe;

    public InformeDecoratorEstilos(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String mostrarContenido() {
        return "<estilos especificos> " + informe.mostrarContenido() + "</estilos especificos>";
    }
}
