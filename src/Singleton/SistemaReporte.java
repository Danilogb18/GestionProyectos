package Singleton;

public class SistemaReporte {
    public static void main(String[] args) {
        ReportGenerator generador1 = ReportGenerator.getInstancia();
        generador1.generarReporte("PDF");

        ReportGenerator generador2 = ReportGenerator.getInstancia();
        generador2.generarReporte("Word");

        if (generador1 == generador2) {
            System.out.println("Ambas instancias son la misma. Singleton funcionando correctamente.");
        } else {
            System.out.println("Error: Instancias diferentes.");
        }
    }
}
