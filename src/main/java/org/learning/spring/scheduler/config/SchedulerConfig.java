package org.learning.spring.scheduler.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {
  @Scheduled(cron = "42 * * * * ?")
  public void scheduled() {
    System.out.println("DayScheduler.scheduled");
  }
}
