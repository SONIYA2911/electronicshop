FROM jkremser/mini-jre:8.1

ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap"

LABEL BASE_IMAGE="jkremser/mini-jre:8"

ADD target/x-operator-*.jar /x-operator.jar

CMD ["/usr/bin/java", "-jar", "/x-operator.jar"]
