package estruturais.observer;

import estruturais.observer.job.LancamentosVencidosJob;
import estruturais.observer.listeners.EmailListener;
import estruturais.observer.listeners.Listener;
import estruturais.observer.listeners.SMSListener;
import estruturais.observer.notifier.Notificador;
import estruturais.observer.notifier.NotificadorLancamentosVencidos;
import estruturais.observer.repository.Lancamentos;

public class Principal {

    public static void main(String[] args) throws Exception {
        Notificador notificador = new NotificadorLancamentosVencidos();

        Listener enviadorEmail = new EmailListener(notificador);
        Listener enviadorSms = new SMSListener(notificador);

      //  JobDataMap jobDataMap = new JobDataMap();
        Lancamentos lancamentos = new Lancamentos();

       // Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

//        jobDataMap.put("lancamentos", lancamentos);
//        jobDataMap.put("notificador", notificador);

//        JobDetail job = newJob(LancamentosVencidosJob.class)
//                .setJobData(jobDataMap)
//                .withIdentity("lancamentosVencidosJob", "lancamentosVencidosGroup")
//                .build();

//        CronTrigger trigger = newTrigger()
//                .withIdentity("trigger1", "group1")
//                .withSchedule(cronSchedule("0 * * * * ?"))
//                .build();
//
//        scheduler.scheduleJob(job, trigger);
//
//        scheduler.start();
//
//        Thread.sleep(220000);
//
//        scheduler.shutdown(true);
    }

}