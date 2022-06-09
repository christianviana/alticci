# Exercício Alticci 

Este exercício usa o framework Java Quarkus: https://quarkus.io/

## Pré-requisitos

- JDK 11+ instalado com JAVA_HOME configurado
- Apache Maven 3.8.1+
- [Docker](https://www.docker.com) (opcional)

## Instruções para instalação e execução (em dev Mode)


- Clonar o [repositório](https://github.com/christianviana/alticci) em sua máquina local.

- Dentro do diretório raiz do repositório, executar o comando:

	  
```shell script
./mvnw compile quarkus:dev`
```
Este comando executa a aplicação no modo desenvolvimento (dev mode).

Criei uma [página simples](http://localhost:8080/alticci.html) usando uma versão antiga do AngularJS, apenas para fins de testes.

Alternativamente, para execução em contêiner docker, pode-se utilizar a implementação padrão fornecida pelo quarkus. As instruções para geração e execução da imagem encontram-se no arquivo `src/main/docker/Dockerfile.jvm`. 

TLDR: A princípio, basta executar a sequência de comandos abaixo: 

```shell script
./mvnw package
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/alticci-jvm .
docker run -i --rm -p 8080:8080 quarkus/alticci-jvm
```

## Instruções para empacotar e executar a aplicação (opcional)

A aplicação pode ser empacotada usando:

```shell script
./mvnw package
```

O comando produz o arquivo `quarkus-run.jar` na pasta `target/quarkus-app/`.
Este não é um *jar gordo*, pois as dependências estão `target/quarkus-app/lib/`.

A aplicação agora pode ser executada usando `java -jar target/quarkus-app/quarkus-run.jar`.

Para criar um *jar gordo* contendo as dependências, execute o comando abaixo:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

## Documentação da API REST

A documentação no formato Open API e a ferramenta SwaggerUI podem ser acessadas através dos links abaixo, quando executando a aplicação em *dev mode*:

- [Open API](http://localhost:8080/q/openapi)

- [Swagger](http://localhost:8080/q/swagger-ui/)

## Testes

- Escrevi alguns testes de integração que podem ser encontrados na pasta `/src/main/test`

- Quando executando a aplicação em *dev mode*, os testes podem ser executados ao pressionar a tecla `r` no console de execução

