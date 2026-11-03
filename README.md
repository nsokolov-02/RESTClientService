Учебный проект, демонстрирующий взаимодействие REST-сервиса и клиентского приложения: сервис хранит и отдаёт данные о постах, а веб-приложение обращается к нему по HTTP.

## Состав проекта

| Модуль | Назначение |
|--------|------------|
| `PostsRestService` | REST-сервис для работы с постами (создание, получение, изменение, удаление) |
| `SocialNetworkWebApplication` | Веб-приложение «социальная сеть», выступает REST-клиентом и получает данные от `PostsRestService` |

## Как это работает

```
SocialNetworkWebApplication  ──HTTP/JSON──▶  PostsRestService
        (клиент)                                (сервер)
```

## Технологии

- Java [25]
- [Spring Boot]
- [Maven]
- [База данных: PostgreSQL / Hibernate]

## Запуск

1. Клонируйте репозиторий:
   ```
   git clone https://github.com/nsokolov-02/RESTClientService.git
   ```
2. Запустите сервис `PostsRestService` (по умолчанию порт 9090).
3. Запустите `SocialNetworkWebApplication` (по умолчанию порт 9091).
4. Откройте в браузере `http://localhost:[порт]`.

## API сервиса

| Метод | URL | Описание |
|-------|-----|----------|
| GET | `/posts` | Список всех постов |
| GET | `/posts/{id}` | Пост по идентификатору |
| POST | `/posts` | Создать пост |
| PUT | `/posts/{id}` | Обновить пост |
| DELETE | `/posts/{id}` | Удалить пост |


## Автор

[nsokolov-02](https://github.com/nsokolov-02)

