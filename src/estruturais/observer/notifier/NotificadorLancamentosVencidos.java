package estruturais.observer.notifier;

import estruturais.observer.listeners.Listener;
import estruturais.observer.model.Lancamento;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificadorLancamentosVencidos implements Notificador {

    private Set<Listener> listeners;
    private List<Lancamento> lancamentosVencidos;

    public NotificadorLancamentosVencidos() {
        this.listeners = new HashSet<>();
    }

    @Override
    public void registrarListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removerListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notificarListeners() {
        for (Listener listener : listeners) {
            listener.atualizar();
        }
    }

    @Override
    public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos) {
        this.lancamentosVencidos = lancamentosVencidos;
        this.notificarListeners();
    }

    @Override
    public List<Lancamento> getLancamentosVencidos() {
        return this.lancamentosVencidos;
    }

}
