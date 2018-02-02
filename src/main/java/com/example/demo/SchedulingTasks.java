package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulingTasks {

    private static final Logger log = LoggerFactory.getLogger(SchedulingTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 300000)
    public void reportCurrentTime(){


        RestTemplate restTemplate = new RestTemplate();
        Weather weather = restTemplate.getForObject(
                "https://query.yahooapis.com/v1/public/yql?q=select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"nome, ak\")&format=json&env=store://datatables.org/alltableswithkeys", Weather.class);
        log.info(weather.toString());
        log.info( "The time is now {}", dateFormat.format(new Date()));
    }
}

