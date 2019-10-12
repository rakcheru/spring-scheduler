FROM centos:centos7

MAINTAINER RAKESH

RUN yum -y update && yum -y install wget tar java-1.8.0-openjdk java-1.8.0-openjdk-devel

#Env
ENV JAVA_HOME /etc/alternatives/jre
ENV CATALINA_HOME /opt/tomcat
ENV PATH $PATH:$JAVA_HOME/bin

WORKDIR /opt/tomcat/

ADD /target/spring-scheduler.jar  /opt/tomcat/spring-scheduler.jar

EXPOSE 80

USER root
CMD java -jar -Dserver.port=80  /opt/tomcat/spring-scheduler.jar

