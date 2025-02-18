# RAG

RAG (Retrieval-Augmented Generation) é uma abordagem que combina recuperação de informações com geração de texto para
melhorar a qualidade das respostas de modelos de linguagem.

## Objetivo

Criar um microserviço de geração de embeddings de texto com flask + torch.

Criar um microserviço com quarkus para persistir os embeddings gerados e analisar a similaridade entre os embeddings
persistidos e os embeddings de uma requisição.

Enviar requisição para API da OpenAI para geração de texto junto com o embedding gerado.

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
