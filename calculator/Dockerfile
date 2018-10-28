FROM  frolvlad/alpine-oraclejdk8:slim
RUN echo $PWD
COPY target/calculator-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
