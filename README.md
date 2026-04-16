# Locatech API

API backend desenvolvida com Spring Boot para gerenciamento de locação de veículos.

## Objetivo do projeto

Este projeto foi construído como exercício prático de desenvolvimento backend em Java, com foco em:

- criação de APIs REST com Spring MVC
- organização em camadas (Controller → Service → Repository)
- persistência via Spring JDBC com banco H2
- modelagem de domínio com entidades reais

## Stack

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.5-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 4.0.5"/>
  <img src="https://img.shields.io/badge/Spring_JDBC-blue?style=for-the-badge&logo=spring" alt="Spring JDBC"/>
  <img src="https://img.shields.io/badge/H2-lightblue?style=for-the-badge" alt="H2 Database"/>
  <img src="https://img.shields.io/badge/Lombok-red?style=for-the-badge" alt="Lombok"/>
</p>

## Funcionalidades implementadas

- CRUD de veículos
- organização em camadas: controller, service, repository, entities
- banco H2 em memória para ambiente local

## Configuração atual

O projeto roda localmente com **H2 em memória**.

- banco: H2 in-memory
- console disponível em `/h2-console`

> Nota: o projeto usa **Spring JDBC** (não Spring Data JPA). A camada de persistência é implementada diretamente com `JdbcTemplate`.

## Como executar

```bash
git clone https://github.com/vineog23-boop/locatech-api.git
cd locatech-api
mvn clean install
mvn spring-boot:run
```

A aplicação sobe por padrão em:

```
http://localhost:8080
```

Console H2:

```
http://localhost:8080/h2-console
```

## Arquitetura

```
src/
└── main/java/br/com/fiap/localtech/localtech/
    ├── controllers/
    ├── entities/
    ├── repository/
    └── service/
```

## Conceitos aplicados

- arquitetura em camadas
- Spring MVC com `@RestController`
- Spring JDBC com `JdbcTemplate`
- banco H2 em memória para desenvolvimento local

## Status

Projeto de estudo em evolução.

## Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte da formação em Java backend (ADS — PUCPR + Pós-Tech FIAP).
