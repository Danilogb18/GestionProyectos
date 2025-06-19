public class NotificadorEmail implements Notificador {

    @Override
    public void enviar (String mensaje){
        System.out.println("Notificacion enviada por email: " + mensaje);
    }
}
