package delivery;
public class NotificacaoEmail implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {

        System.out.println("E-mail enviado para " + destinatario + ": " + mensagem);

    }
}