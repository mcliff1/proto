# proto

Project to build discovery war file.  Initially will display some container and environment information, expect to add basic capabilities of standard J2EE WebApp container and package in Docker container

This will publish a docker image running a Java Web Application.


Main | SubProject
---|---
ProtoWebApp | WAR file (requires the AWS credentials in the environment) that will store to the SimBot Dynamo SB
JavaBot | Java implentation of a bot that will post


## Requires

- Maven
- JDK

## Source
Copied from
https://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/

mvn archetype:generate -DgroupId=com.cliffconsulting \
	-DartifactId=ProtoWebApp \
	-DarchetypeArtifactId=maven-archetype-webapp
	-DinteractiveMode=false


This was then checked in;
Next to do a build

On Debian Server `apt-get install -y openjdk-8-jdk maven`  installed necessary java as well

- mvn package


Created a Dockerfile that will use the tomcat image and put this maven release in it


- docker build -t name/proto .
- docker run -d -p 8080:8080 -name myproto name/proto



## Next Steps

in web.xml upgrade form 2.3 to 2.5 dtd define
To generate eclipse support files run
mvn eclipse:eclipse -Dwtpversion=2.0
