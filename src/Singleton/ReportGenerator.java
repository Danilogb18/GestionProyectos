package Singleton;

public class ReportGenerator {
    private static ReportGenerator instancia;

    private ReportGenerator() {
        System.out.println("Generador de reportes inicializado.");
    }

    public static ReportGenerator getInstancia() {
        if (instancia == null) {
            instancia = new ReportGenerator();
        }
        return instancia;
    }

    public void generarReporte(String tipo) {
        System.out.println("Generando reporte en formato: " + tipo);
    }

}
