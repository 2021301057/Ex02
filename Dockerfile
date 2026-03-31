# 1. 베이스 이미지 설정
FROM eclipse-temurin:21-jdk

# 2. 현재 생성된 jar파일을 컨테이너 내부에 복사
COPY ./target/Ex01-0.0.1-SNAPSHOT.jar app.jar

# 3. 응용 프로그램 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]