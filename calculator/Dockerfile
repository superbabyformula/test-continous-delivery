FROM  frolvlad/alpine-oraclejdk8:slim
#COPY target/calculator-0.0.1.jar app.jar
COPY /var/jenkins_home/workspace/calculator/calculator/target/calculator-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
