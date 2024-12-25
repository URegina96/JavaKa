#!/bin/bash

# Остановка текущего приложения (если необходимо)
ssh user@your-server-ip "pm2 stop my-app || true"

# Копирование файлов на сервер
scp -r ./target/*.jar user@your-server-ip:/path/to/deployment

# Настройка окружения на сервере (если требуется)
ssh user@your-server-ip "cd /path/to/deployment && ./install_dependencies.sh"

# Запуск нового приложения
ssh user@your-server-ip "cd /path/to/deployment && pm2 start my-app.jar"
