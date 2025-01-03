
# Проект "JavaKa"

## Цель проекта

Проект "JavaKa" предназначен для разработки информационной системы, которая предоставляет услуги клининга для жилых и производственных помещений. Система позволяет пользователям формировать заявки на уборку, а администраторам — управлять этими заявками.

## Как выполнено

Проект реализован с использованием фреймворка Spring Boot, что обеспечило быструю разработку и интеграцию различных компонентов системы. База данных была спроектирована с учётом предметной области, а также разработаны диаграммы базы данных для лучшего понимания структуры данных.

### Основные технологии:
- **Java 17**
- **Spring Boot 3.1.4**
- **Spring Data JPA**
- **MySQL**
- **Thymeleaf** (для генерации HTML)
- **Spring Security** (для управления авторизацией и аутентификацией)
- **jQuery** (для взаимодействия с сервером и обработки AJAX-запросов)
- **HTML/CSS** (для фронтенда)
- **Bootstrap** (для адаптивной верстки)

## Функциональность

1. **Страница регистрации**
    - Пользователи могут регистрироваться, вводя уникальный логин, пароль, ФИО, телефон и адрес электронной почты. При валидации ошибок отображаются на форме.

2. **Страница авторизации**
    - Пользователи могут входить в систему, вводя логин и пароль. Неверные попытки сопровождаются сообщениями об ошибках.

3. **Создание заявки**
    - Авторизованные пользователи могут просматривать историю своих заявок и оставлять новые заявки, указывая адрес, контактные данные, вид услуги и предпочтительный тип оплаты.

4. **Панель администратора**
    - Доступ к панели осуществляется по логину и паролю. Администраторы могут видеть все заявки, изменять их статусы и указывать причины отмены.

## Как работает проект

1. **Регистрация и авторизация**
    - При регистрации данные пользователя сохраняются в базе данных после валидации. Пользователи могут входить в систему с созданным логином и паролем.

2. **Создание и управление заявками**
    - Пользователи могут создавать заявки на уборку, которые сохраняются в системе. Администраторы имеют доступ к информации по всем заявкам и могут изменять их статус.

3. **Интерфейс**
    - Дизайн страниц адаптирован для мобильных устройств с разрешением 390x844 px. Используются минималистичные стили без избыточности в цветах, чтобы улучшить пользовательский опыт. Также добавлены анимации для более плавного взаимодействия с интерфейсом.

## Для кого предназначен проект

Информационная система "JavaKa" предназначена для:
- Частных лиц, желающих заказать клининговые услуги.
- Администраторов, управляющих заявками и обеспечивающих выполнение услуг.
- Разработчиков, желающих ознакомиться с реализацией веб-приложений на базе Spring Boot.

## Установка и запуск

1. **Клонируйте репозиторий:**
   ```shell
   git clone <URL-репозитория>
   ```

2. **Настройте базу данных MySQL и создайте базу данных с именем `javaka`.**

3. **Обновите файл конфигурации `application.properties` с вашими данными для подключения к базе данных.**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/javaka
   spring.datasource.username=ваш_пользователь
   spring.datasource.password=ваш_пароль
   spring.jpa.hibernate.ddl-auto=update
   ```

4. **Соберите проект с помощью Maven:**
   ```shell
   mvn clean install
   ```

5. **Запустите приложение:**
   ```shell
   mvn spring-boot:run
   ```

6. **Откройте браузер и перейдите по адресу `http://localhost:8080/login` для доступа к системе.**

## Итог

Проект "JavaKa" демонстрирует, как можно создать полноценное веб-приложение для оказания услуг, используя современные технологии и подходы. Система удобна как для пользователей, так и для администраторов, обеспечивая эффективное управление клининговыми услугами.

## Документация и отчет по работе программы

### Описание программы

Данная программа представляет собой веб-приложение для управления заявками на услуги клининга. Приложение позволяет пользователям регистрироваться, входить в систему, создавать заявки на услуги, а администраторам - управлять этими заявками. Приложение построено с использованием Spring Boot и использует базы данных для хранения информации о пользователях и заявках.

### Основные компоненты программы

1. **Сущности (Entities):**
    - **Request:** Описывает заявку на услугу, содержит информацию о пользователе, адресе, типе услуги, дате, времени, методе оплаты и статусе.
    - **User:** Описывает пользователя системы, включая имя, телефон, email и учетные данные.

2. **Контроллеры (Controllers):**
    - **HomeController:** Управляет отображением форм регистрации и входа, а также админ-панели.
    - **LoginController:** Обрабатывает вход пользователей в систему.
    - **RequestController:** Обрабатывает API-запросы, связанные с заявками.
    - **UserController:** Обрабатывает регистрации пользователей.

3. **Сервисы (Services):**
    - **RequestService:** Содержит бизнес-логику для работы с заявками.
    - **UserService:** Управляет пользователями и их аутентификацией.

4. **Репозитории (Repositories):**
    - **RequestRepository:** Интерфейс для работы с заявками в базе данных.
    - **UserRepository:** Интерфейс для работы с пользователями в базе данных.

5. **Конфигурация безопасности (SecurityConfig):** Настраивает безопасность приложения, включая аутентификацию и авторизацию пользователей.

6. **DTO (Data Transfer Objects):**
    - **LoginRequest:** Объект для передачи данных при входе в систему.

7. **Шаблоны (Thymeleaf templates):** HTML-шаблоны для отображения пользовательского интерфейса.

### Архитектура приложения

Приложение построено на основе архитектуры MVC (Model-View-Controller). Основные компоненты взаимодействуют между собой следующим образом:
- **Модель (Model):** Сущности (Request, User) представляют модель данных.
- **Представление (View):** HTML-шаблоны, написанные с использованием Thymeleaf, представляют пользовательский интерфейс.
- **Контроллер (Controller):** Обрабатывает HTTP-запросы, взаимодействует с моделями и возвращает представления.

Конечно, продолжим с раздела "Как работает код".

### Как работает код

#### 1. Сущности

Сущности `Request` и `User` аннотированы с помощью JPA аннотаций, что позволяет использовать их для работы с базой данных. Эти классы содержат поля, соответствующие столбцам в таблицах базы данных, и геттеры/сеттеры для доступа к данным.

Пример класса `Request`:

```java
@Entity
@Table(name = "requests")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String contactPhone;
    private String serviceType;
    private String preferredDate;
    private String preferredTime;
    private String status;
    private String rejectionReason;

    // Геттеры и сеттеры
}
```

Пример класса `User`:

```java
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String username;
    private String password;
    private String phone;
    private String email;

    // Геттеры и сеттеры   
    
}
```

#### 2. Контроллеры

Контроллеры обрабатывают HTTP-запросы. Например, `LoginController` управляет входом пользователей:

```java
@PostMapping("/login")
public String login(@ModelAttribute("loginRequest") LoginRequest loginRequest, Model model) {
    try {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        // логика перенаправления
    } catch (BadCredentialsException e) {
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }
}
```

#### 3. Сервисы

Сервисы содержат бизнес-логику. Например, в `RequestService` реализованы методы для получения, создания и удаления заявок:

```java
@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }

    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }

    public void deleteRequest(Long requestId) {
        requestRepository.deleteById(requestId);
    }
}
```

#### 4. Репозитории

Репозитории используют Spring Data JPA для работы с базой данных. Они предоставляют интерфейсы для выполнения стандартных операций CRUD (Create, Read, Update, Delete):

```java
@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findByUser(User user);
}
```

#### 5. Конфигурация безопасности

Конфигурация безопасности настраивает правила доступа для различных URL-адресов:

```java
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.authorizeRequests(authorizeRequests ->
        authorizeRequests
            .requestMatchers("/admin/**").hasRole("ADMIN")
            .requestMatchers("/register", "/login", "/css/**", "/js/**").permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(formLogin ->
            formLogin
                .loginPage("/login")
                .permitAll()
        )
        .logout(logout ->
            logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
        );
    return http.build();
}
```

#### 6. DTO (Data Transfer Objects)

DTO используются для передачи данных между клиентом и сервером. Пример класса `LoginRequest`:

```java
public class LoginRequest {
    private String username;
    private String password;

    // Геттеры и сеттеры 
    
}
```

#### 7. Шаблоны (Thymeleaf templates)

HTML-шаблоны используются для генерации пользовательского интерфейса. Пример шаблона `login.html`:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login</title>
    <link rel="stylesheet" th:href="@{/css/styles.css}">
</head>
<body>
<div class="container">
    <h1>Login</h1>
    <form th:action="@{/login}" method="post">
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <button type="submit">Login</button>
    </form>
    <div th:if="${error}" th:text="${error}" class="error-message"></div>
</div>
</body>
</html>
```

### Заключение

Данная программа представляет собой полный стек веб-приложения для управления услугами клининга. Она использует современные технологии, такие как Spring Boot, Spring Security и JPA, что обеспечивает надежную и безопасную работу с данными пользователей и заявок. Приложение легко расширяется и поддерживается благодаря четкой архитектуре и разделению ответственности между компонентами.

### Структура CI/CD Pipeline

#### 1. **Джоб: Build**
Этот джоб отвечает за сборку проекта и его тестирование. Он включает следующие шаги:

- **Checkout code**: используется действие `actions/checkout@v2` для клонирования репозитория, чтобы получить актуальную версию кода.

- **Set up JDK 17**: используется действие `actions/setup-java@v2` для установки JDK версии 17, необходимого для сборки проекта.

- **Build with Maven**: выполняет команду `mvn clean install`, которая собирает проект и создает исполняемый файл (JAR).

- **Run tests**: выполняет команду `mvn test`, которая запускает тесты для проверки корректности работы приложения.

**Используемые GitHub Actions:**
- `actions/checkout@v2`
- `actions/setup-java@v2`

**Триггеры для запуска:**
- Этот джоб запускается при пуше в ветку `master` или при создании pull request в ветку `master`.

#### 2. **Джоб: Deploy**
Этот джоб отвечает за развертывание приложения на удаленном сервере и зависит от успешного выполнения предыдущего джоба (Build). Он включает следующие шаги:

- **Checkout code**: также используется действие `actions/checkout@v2` для клонирования репозитория.

- **Set up SSH for deployment**: используется действие `webfactory/ssh-agent@v0.5.3` для настройки SSH с использованием секретного ключа, хранящегося в `secrets.SSH_PRIVATE_KEY`.

- **Deploy to remote server**: выполняет скрипт `deploy.sh`, который копирует собранные файлы на удаленный сервер и запускает приложение.

**Используемые GitHub Actions:**
- `actions/checkout@v2`
- `webfactory/ssh-agent@v0.5.3`

**Триггеры для запуска:**
- Этот джоб запускается только после успешного завершения джоба Build.

### Зависимости между джобами
Джоб Deploy зависит от успешного выполнения джоба Build. Это означает, что развертывание приложения будет происходить только в том случае, если сборка и тестирование завершились успешно.

### Итог
Настроенный CI/CD Pipeline для проекта "JavaKa" обеспечивает автоматизацию процесса сборки, тестирования и развертывания приложения, что значительно упрощает процесс разработки и повышает надежность выпуска новых версий.  

