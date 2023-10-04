# Используйте официальный образ Maven, который уже содержит JDK
FROM maven:3.8-openjdk-17

# Установите рабочую директорию внутри контейнера
WORKDIR /app

# Добавьте файл 'Chapters.json' из вашей локальной директории 'src/main/resources/' в контейнер
# Если ваш файл 'Chapters.json' находится в директории 'src/main/resources/', то этот шаг должен быть правильным
ADD src/main/resources/Chapters.json /app/Chapters.json

# Копируйте исходный код приложения в контейнер
COPY . /app/

# Соберите JAR-файл внутри контейнера
RUN mvn clean package

# Команда для запуска приложения (замените "wordsmarty-api-1.0.jar" на имя вашего JAR-файла)
CMD ["java", "-jar", "target/wordsmarty-api-1.0.jar"]
