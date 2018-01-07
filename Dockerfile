FROM tomcat
WORKDIR /usr/local/tomcat

COPY ProtoWebApp/target/ProtoWebApp.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
