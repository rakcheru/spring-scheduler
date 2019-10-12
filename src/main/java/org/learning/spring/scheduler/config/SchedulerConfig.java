package org.learning.spring.scheduler.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {
  private static final Logger LOGGER = LoggerFactory.getLogger(SchedulerConfig.class);
  @Scheduled(cron = "${app.scheduler.cron.every_second}")
  public void everySecond() {
    LOGGER.warn("Every second task");
  }
  @Scheduled(cron = "${app.scheduler.cron.every_5_seconds}")
  public void everyFiveSeconds() {
    LOGGER.warn("Every 5 seconds task");
  }
  @Scheduled(cron = "${app.scheduler.cron.every_minute}")
  public void everyMinute() {
    LOGGER.warn("Every minute task");
  }
  
  @Scheduled(cron = "${app.scheduler.cron.every_30_minute}")
  public void everyThirtyMinute() {
    LOGGER.warn("Every 30 minute task");
  }
  @Scheduled(cron = "${app.scheduler.cron.every_hour}")
  public void everyHour() {
    LOGGER.warn("Every Hour task");
  }
  @Scheduled(cron = "${app.scheduler.cron.every_day}")
  public void everyDay() {
    LOGGER.warn("Every Hour task");
  }
  @Scheduled(cron = "${app.scheduler.cron.every_3_months}")
  public void everyThreeMonths() {
    LOGGER.warn("Every Hour task");
  }
}
