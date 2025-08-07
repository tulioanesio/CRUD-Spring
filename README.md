# API de CRUD com Spring Boot

Este projeto é uma **API RESTful simples** construída com **Spring Boot** para fins **educacionais**. Ele permite operações básicas de **CRUD (Create, Read, Update, Delete)** em usuários com integração ao banco de dados.

---

## Tecnologias Utilizadas

- Java 17+
- Maven
- Spring Boot
- Spring Data JPA
- Spring Web
- Flyway Migration
- PostgreSQL Driver
- PostgreSQL

---

## Endpoints da API

| Método | Rota          | Descrição                     |
|--------|---------------|-------------------------------|
| GET    | /user         | Lista todos os usuários       |
| GET    | /user/{id}    | Busca um usuário por ID       |
| POST   | /user         | Cria um novo usuário          |
| PUT    | /user/{id}    | Atualiza um usuário existente |
| DELETE | /user/{id}    | Remove um usuário             |

---

## Exemplo de Requisição (JSON)

```json
{
  "name": "Teste",
  "email": "teste@email.com",
  "age": 28,
  "country": "Brasil"
}
```

## Configurações do projeto

Clone o projeto
```
git clone https://github.com/tulioanesio/CRUD-Spring.git
cd CRUD-Spring
```

Properties
```
spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
A API estará disponível em:
http://localhost:8080/user
