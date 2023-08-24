package estruturais.observer.notifier;

import estruturais.observer.listeners.Listener;
import estruturais.observer.model.Lancamento;

import java.util.List;

public interface Notificador {

    public void registrarListener(Listener listener);
    public void removerListener(Listener listener);
    public void notificarListeners();

    public void novosLancamentosVencidos(List<Lancamento> lancamentosVencidos);
    public List<Lancamento> getLancamentosVencidos();

}
