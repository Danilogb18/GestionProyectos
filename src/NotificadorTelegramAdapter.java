public class NotificadorTelegramAdapter implements Notificador {

    ApiTelegram apiTelegram;

    public NotificadorTelegramAdapter(ApiTelegram apiTelegram) {
        this.apiTelegram = apiTelegram;
    }

    public void enviar (String mensaje){
        System.out.println("Notificación enviada por telegram: " + mensaje);
    }
}
