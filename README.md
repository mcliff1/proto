# proto
Project to build discovery war file.  Initially will display some container and environment information, expect to add basic capabilities of standard J2EE WebApp container


## Source
Copied from
https://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/
mvn archetype:generate -DgroupId=com.cliffconsulting \
	-DartifactId=ProtoWebApp \
	-DarchetypeArtifactId=maven-archetype-webapp
	-DinteractiveMode=false

## Next Steps

in web.xml upgrade form 2.3 to 2.5 dtd define
To generate eclipse support files run
mvn eclipse:eclipse -Dwtpversion=2.0

