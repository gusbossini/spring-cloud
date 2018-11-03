# spring-cloud
Spring cloud features, Eureka Server and Client, Feign and Hystrix.

## Objetivo
Este projeto serve apenas para exemplificar e testar como funcionado a stack do spring cloud, eh um exemplo muito simple apenas didatico

## How to run
Execute o comando "docker-compose up -d" no terminal.
Depois de todos os servers online, acesse "localhost:8761" para ver o painel do Eureka, service registry.
Acesse "localhost:8080" e fique pressionando F5 a mensagem ira mudar, isso porque esta batendo em clusters diferentes registrados pelo Eureka.
Execute o comando "docker-compose stop data-api" no painel do Eureka o servico nao estara mais registrado, acesse novamente "localhost:8080" e agora ira retornar apenas 1 mensagem.
Execute o comando "docker-compose stop data-api-1" no painel do Eureka o servico nao estara mais registrado, acesse novamente "localhost:8080" e agora a mensagem sera a default para nao retornar erro ao cliente.