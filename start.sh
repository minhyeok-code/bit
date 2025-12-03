#!/bin/bash

# 실행 중인 프로세스 종료
pkill -f bitcoinlion-0.0.1-SNAPSHOT.jar || echo "No app running"

# 프로세스 종료 대기
sleep 15

# 새 JAR 파일 실행
nohup /usr/bin/java -jar /home/ec2-user/bitcoinlion-0.0.1-SNAPSHOT.jar > /home/ec2-user/app.log 2>&1 &

echo "Application deployment completed"