public class NotificadorWhatsappAdapter implements Notificador{
    ServicioWhatsapp servicioWhatsapp;

    public NotificadorWhatsappAdapter(ServicioWhatsapp servicioWhatsapp) {
        this.servicioWhatsapp = servicioWhatsapp;
    }

    public void enviar(String mensaje){
        servicioWhatsapp.enviarMensajePorWhatsapp(mensaje);
    }
}
