package estruturais.observer.listeners;

import estruturais.observer.model.Lancamento;
import estruturais.observer.notifier.Notificador;

import java.util.List;

public class SMSListener implements Listener {

    private Notificador notificador;

    public SMSListener(Notificador notificador) {
        this.notificador = notificador;
        this.notificador.registrarListener(this);
    }

    @Override
    public void atualizar() {
        List<Lancamento> lancamentosVencidos = this.notificador.getLancamentosVencidos();

        for (Lancamento lancamento : lancamentosVencidos) {
            System.out.println("Enviando SMS para " + lancamento.getPessoa().getTelefone());
        }

        // this.notificador.removerListener(this);
    }

}
