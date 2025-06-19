public class App {
    public static void main(String[] args) throws Exception {

        //Probando decoradores
        Informe informe1 = new InformeBasico("Contenido de informe");
        System.out.println(informe1.mostrarContenido());
        Informe informe1Color = new InformeDecoratorColor(informe1);
        System.out.println(informe1Color.mostrarContenido());
        Informe informe1FuentesYColor = new InformeDecoratorFuentes(informe1Color);
        System.out.println(informe1FuentesYColor.mostrarContenido());

        //Probando notificaciones con adapters
        Notificador notificadorEmail = new NotificadorEmail();
        notificadorEmail.enviar("Hola a todos");
        Notificador notificadorWhatsapp = new NotificadorWhatsappAdapter(new ServicioWhatsapp());
        notificadorWhatsapp.enviar("Hola a todos desde wasa");
        Notificador notificadorTelegram = new NotificadorTelegramAdapter(new ApiTelegram());
        notificadorTelegram.enviar("Saludos desde telegram");
    }
}
