<h1 align="center">🚗 Locatech API</h1>
<p align="center">
  API backend desenvolvida com Spring Boot para gerenciamento de locação de veículos
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.5-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 4.0.5"/>
  <img src="https://img.shields.io/badge/Spring_JDBC-blue?style=for-the-badge&logo=spring" alt="Spring JDBC"/>
  <img src="https://img.shields.io/badge/Spring_Web_MVC-228B22?style=for-the-badge" alt="Spring Web MVC"/>
  <img src="https://img.shields.io/badge/H2-09476B?style=for-the-badge" alt="H2"/>
  <img src="https://img.shields.io/badge/Lombok-CC0000?style=for-the-badge" alt="Lombok"/>
</p>

---

## 📌 Sobre o projeto

A **Locatech API** é uma aplicação backend desenvolvida para estudo de construção de APIs REST com Java e Spring Boot, aplicada ao contexto de locação de veículos.

O projeto foi pensado para praticar **organização em camadas**, **modelagem de domínio**, **operações de CRUD** e **persistência com Spring JDBC**.

---

## ✅ Funcionalidades implementadas

- CRUD de veículos
- Organização em camadas
- Execução local simples com banco H2 em memória

---

## 🧱 Stack utilizada

- **Java 21**
- **Spring Boot 4.0.5**
- **Spring JDBC**
- **Spring Web MVC**
- **H2 Database**
- **Lombok**

---

## 🏛️ Arquitetura

A aplicação utiliza uma arquitetura em camadas com separação entre:
- `controllers`
- `entities`
- `repository`
- `service`

---

## ⚙️ Configuração atual

O projeto roda localmente com **H2 em memória**.

> Observação: a camada de persistência utiliza **Spring JDBC**, e não Spring Data JPA.

---

## ▶️ Como executar

```bash
git clone https://github.com/vineog23-boop/locatech-api.git
cd locatech-api
mvn clean install
mvn spring-boot:run
```

**Acesso local**
- Aplicação: http://localhost:8080
- Console H2: http://localhost:8080/h2-console

---

## 📚 Conceitos aplicados

- Arquitetura em camadas
- Spring MVC
- Persistência com JdbcTemplate
- Banco H2 para desenvolvimento local

---

## 🚧 Status

Projeto de estudo em evolução.

---

## 👨‍💻 Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte da formação em Java backend.
