Command to run container :
------------------------

mvn clean install -DskipTests && \
docker build . -t spring-scheduler && \
docker container run -p 8009:80 --rm  \
-e app.scheduler.cron.every_second="0/1 * * * * ?" \
-e app.scheduler.cron.every_5_seconds="0/5 * * * * ?" \
-e app.scheduler.cron.every_minute="0 0/1 * * * ?" \
-e app.scheduler.cron.every_hour="0 0 0/1 * * ?" \
-e app.scheduler.cron.every_day="0 0 0 0/1 * ?" \
-e app.scheduler.cron.every_3_months="0 0 0 1 0/4 ?" \
-e app.scheduler.cron.every_30_minute="0 0/30 * * * ?" \
spring-scheduler
