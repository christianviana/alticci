# Projeto Alticci 


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

Falta: 

Colocar tratamento para limitação de tamanho e incluir isso nos docs

fazer teste de estouro de tamanho

escrever premissa de limite de tamanho


Fazer angular e incluir neste projeto

colocar no github.

colocar em container?

colocar endereços do swagger e open-api
http://localhost:8080/q/openapi
http://localhost:8080/q/swagger-ui/


