package com.ikea.soia.scheduler;

import com.ikea.soia.model.entity.SchedulerModel;
import com.ikea.soia.repository.SchedulerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Configuration

public class DBScheduler {

    @Autowired
    public SchedulerRepository schedulerRepository;
    @Scheduled(fixedDelayString = "#{@getConfigRefreshValue}")
    public void runMe(){

        System.out.println("Hi Me");

    }

    @Bean
    public String getConfigRefreshValue() {
        System.out.println("in here");
       Optional<SchedulerModel> model =  schedulerRepository.findById(1);
        return model.get().value.toString();
    }
}
