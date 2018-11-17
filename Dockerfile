FROM tomcat:8.5-jre8-slim
MAINTAINER Matt Cliff (matt@denvercliffs.com)
WORKDIR /usr/local/tomcat

RUN rm -rf /usr/local/tomcat/webapps && mkdir /usr/local/tomcat/webapps

COPY ProtoWebApp/target/ProtoWebApp.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
