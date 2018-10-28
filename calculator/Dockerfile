FROM  frolvlad/alpine-oraclejdk8:slim
COPY target/calculator-0.0.1.jar app.jar
RUN echo $PWD
ENTRYPOINT ["java","-jar","app.jar"]
