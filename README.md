# RAG

Criando um microserviço com flask para criar um endpoint de geração de embeddings de texto.

E persistindo usando Quarkus + Postgres (PGVector).

Futuramente calculando o score de similaridade entre os embeddings de uma requisição e os embeddings persistidos.

## Rodando o projeto

Buildar o Quarkus
```bash
./gradlew clean build
```

Criar imagem docker do Quarkus
```bash
docker build -f src/main/docker/Dockerfile.jvm -t quarkus-app .
```
Subir a stack com docker-compose

```bash
docker-compose up
```

### Testing embed endpoint

```bash
curl -X POST "localhost:8080/embed" \
     -H "Content-Type: text/plain" \
     --data "Uma casa é amarela"
```
