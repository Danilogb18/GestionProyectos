public class InformeBasico implements Informe {

    private String contenido;
    

    public InformeBasico(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String mostrarContenido() {
        return contenido;
    }
    
}
