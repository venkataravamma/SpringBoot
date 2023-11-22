package com.example.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.apachecommons.CommonsLog;

@Component
public class Scheduler {
	 // between 19:00 PM to 19:59 PM
   // @Scheduled(cron = "0 * 16 * * ?")
	 //@Scheduled(fixedRate = 2000)
	@Scheduled(fixedDelay = 3000, initialDelay = 5000)
    public void scheduleTask()
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
            "dd-MM-yyyy HH:mm:ss.SSS");
 
        String strDate = dateFormat.format(new Date());
 
        System.out.println(
            "Cron job Scheduler: Job running at - "
            + strDate);
    }

}
