package estruturais.observer.job;

import estruturais.observer.model.Lancamento;
import estruturais.observer.notifier.Notificador;
import estruturais.observer.repository.Lancamentos;

import java.util.List;

public class LancamentosVencidosJob{

//    @Override
//    public void execute(JobExecutionContext context) throws JobExecutionException {
//        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
//
//        Lancamentos lancamentos = (Lancamentos) jobDataMap.get("lancamentos");
//        Notificador notificador = (Notificador) jobDataMap.get("notificador");
//
//        List<Lancamento> lancamentosVencidos = lancamentos.todosVencidos();
//        notificador.novosLancamentosVencidos(lancamentosVencidos);
//    }

}
