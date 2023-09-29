# Используйте официальный образ OpenJDK 17
FROM openjdk:17

# Создайте рабочую директорию внутри контейнера
WORKDIR /app

# Добавьте файл 'Chapters.json' из вашей локальной директории 'src/main/resources/' в контейнер
ADD src/main/resources/Chapters.json /app/Chapters.json

# Скопируйте JAR-файл вашего приложения в контейнер
COPY target/wordsmarty-api-1.0.jar /app/

# Команда для запуска приложения (замените "wordsmarty-api-1.0.jar" на имя вашего JAR-файла)
CMD ["java", "-jar", "wordsmarty-api-1.0.jar"]