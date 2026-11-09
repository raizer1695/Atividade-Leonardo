package delivery;
public class NotificacaoWhatsApp implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {

        System.out.println("WhatsApp enviado para " + destinatario + ": " + mensagem);

    }
}