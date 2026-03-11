CREATE TABLE usuarios (
    id SERIAL PRIMARY KEY,
    login VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

-- Inserindo o seu admin já com o hash que funcionou no seu Java
INSERT INTO usuarios (login, senha)
VALUES ('admin', '$2a$10$UEItG0GR5.dxbdxQkN1FAOJfQ.CTipbbTagTvwfBn2omLnHWJ6sC2');