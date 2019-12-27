FROM ncc0706/jdk:8u131

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} /opt/application.jar

CMD [ "sh", "-c", "java -Dserver.port=$PORT -Xmx300m -Xss512k -Dfile.encoding=UTF-8 -Djava.security.egd=file:/dev/./urandom -jar /opt/application.jar" ]