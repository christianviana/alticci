# Exercício Alticci 


## Instruções para execução (em dev Mode)

```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an *über-jar* as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an *über-jar*, execute the following command:

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

