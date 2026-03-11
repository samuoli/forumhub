# ForumHub API - Challenge Alura

API desenvolvida para o desafio ForumHub. 

### 🛠 Tecnologias
- Java 25 + Spring Boot 4
- Spring Security + JWT
- PostgreSQL + Flyway (Migration)
- Hibernate/JPA

### 🚀 Como rodar
1. Configure o banco PostgreSQL no `application.properties`.
2. As tabelas vão ser criadas automaticamente pelo Flyway.
3. Insira um curso inicial, por exemplo: `INSERT INTO cursos (nome, categoria) VALUES ('Java', 'Backend');`.
4. Use o endpoint `/login` para obter o Token JWT.
