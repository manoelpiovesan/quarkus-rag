# RAG

Criando um microserviço com flask para criar um endpoint de geração de embeddings de texto.

E persistindo usando Quarkus + Postgres (PGVector).

Futuramente calculando o score de similaridade entre os embeddings de uma requisição e os embeddings persistidos.

## Getting Started

Buildar quarkus
```bash
    ./gradlew clean build
```

Buildar imagem docker
```bash
    docker build -f src/main/docker/Dockerfile.jvm -t quarkus-app .
```

Docker-compose para subir o banco de dados e o microserviço.

```bash
docker-compose up
```
