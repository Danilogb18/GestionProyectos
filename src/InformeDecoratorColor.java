
public class InformeDecoratorColor implements Informe {
    private Informe informe;

    public InformeDecoratorColor(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String mostrarContenido() {
        return "<color personalizado> " + informe.mostrarContenido() + "</color personalizado>";
    }
}
