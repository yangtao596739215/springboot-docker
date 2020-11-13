# 基础镜像java 1.8
FROM openjdk:8

MAINTAINER maintainer="596739215@qq.com"

ENV env=''

# 匿名数据卷，在启动容器时忘记挂载数据卷，会自动挂载到匿名卷
VOLUME /temp
EXPOSE 8080

# Docker 默认使用 Ubuntu 系统。如果你的自定义镜像使用的是其他发行版，那么这里的命令也要改变。
RUN echo "Asia/Shanghai" > /etc/timezone
RUN dpkg-reconfigure -f noninteractive tzdata

# 定义变量
ARG JAR_FILE=demo-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} interact_class.jar

ENTRYPOINT ["java","-Dspring.profiles.active=${env}","-jar","/interact_class.jar"]
