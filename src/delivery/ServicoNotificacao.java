package delivery;
public class ServicoNotificacao {

    private CanalNotificacao canal;
    public ServicoNotificacao(CanalNotificacao canal) {
        this.canal = canal;
    }
    public void notificar(String destinatario, String mensagem) {
        canal.enviar(destinatario, mensagem);

    }
}