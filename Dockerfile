FROM java:8
ENV PROJECT_ARTIFACTID="IPOdetail" PROJECT_VERSION="0.0.1-SNAPSHOT"
COPY target/$PROJECT_ARTIFACTID-$PROJECT_VERSION.jar /IPOdetail.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "IPOdetail.jar"]