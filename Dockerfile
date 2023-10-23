FROM openjdk:22-slim-bullseye
LABEL authors="CALCULATOR"
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src/main/* -d ./out ./src/main/java/au/bystritskaia/App.java
CMD  java -classpath ./out au.bystritskaia.App