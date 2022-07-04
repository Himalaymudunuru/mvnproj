FROM tomcat
MAINTAINER himalay
#ARG CONT_IMG_VER
WORKDIR /usr/local/tomcat
EXPOSE 8080
COPY  ./target/myproj.war /usr/local/tomcat/webapps
