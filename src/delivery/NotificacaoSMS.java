package delivery;
public class NotificacaoSMS implements CanalNotificacao {

    @Override

    public void enviar(String destinatario, String mensagem) {

        System.out.println("SMS enviado para " + destinatario + ": " + mensagem);

    }
}