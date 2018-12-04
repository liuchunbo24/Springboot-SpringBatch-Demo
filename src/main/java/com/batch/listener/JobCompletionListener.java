package com.batch.listener;


import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

/**
 * Created by Administrator on 2018/12/4.
 */
public class JobCompletionListener extends JobExecutionListenerSupport {

    @Override
    public void beforeJob(JobExecution jobExecution){
        if(jobExecution.getStatus()== BatchStatus.STARTED){
            System.out.println("批处理执行开始....");
        }
    }
    @Override
    public void afterJob(JobExecution jobExecution){
        if(jobExecution.getStatus()== BatchStatus.COMPLETED){
            System.out.println("批处理执行结束....");
        }


    }
}
