FROM centos:centos7

MAINTAINER RAKESH

RUN yum -y update && yum -y install wget tar java-1.8.0-openjdk java-1.8.0-openjdk-devel

#Env
ENV JAVA_HOME /etc/alternatives/jre
ENV CATALINA_HOME /opt/tomcat
ENV PATH $PATH:$JAVA_HOME/bin

WORKDIR /opt/tomcat/

ADD /target/scheduler-1.0.jar  /opt/tomcat/scheduler-1.0.jar

EXPOSE 80

USER root
CMD java $JAVA_OPTS -jar -Dserver.port=80  /opt/tomcat/scheduler-1.0.jar

