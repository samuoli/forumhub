CREATE TABLE respostas (
    id SERIAL PRIMARY KEY,
    mensagem TEXT NOT NULL,
    data_criacao TIMESTAMP NOT NULL,
    solucao BOOLEAN NOT NULL DEFAULT FALSE,
    topico_id INT NOT NULL,
    autor_id INT NOT NULL,
    CONSTRAINT fk_respostas_topico FOREIGN KEY (topico_id) REFERENCES topicos(id),
    CONSTRAINT fk_respostas_autor FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);