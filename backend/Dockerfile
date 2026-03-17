# Use a tiny runtime image (no Maven, just Java)
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the JAR from your local folder into the image
# This assumes first.jar is in the same folder as this Dockerfile
COPY first.jar app.jar

EXPOSE 8080

HEALTHCHECK --interval=30s --timeout=10s --retries=3 \
  CMD wget -qO- http://localhost:8080/api/exams || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]