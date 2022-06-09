# Exercício Alticci 


## Instruções para instalação e execução (em dev Mode)

- Descompactar o arquivo do projeto alticci.zip na pasta de sua preferência

- De dentro da pasta descompactada, executar o comando abaixo: 

```shell script
./mvnw compile quarkus:dev
```

## Intruções para empacotar e executar a aplicação (opcional)

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

