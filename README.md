# 🚗 LocalTech

## 📌 O que o projeto faz

O **LocalTech** é uma API REST backend desenvolvida para gerenciamento de uma **locadora de veículos**.

A aplicação permite:

- Cadastro e listagem de veículos disponíveis
- Registro de pessoas (clientes)
- Controle de aluguéis (associação de pessoa e veículo)
- Consulta e gerenciamento do estoque de veículos

---

## 🚀 Tecnologias utilizadas

<p align="left">
<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/Spring_Boot-4.x-brightgreen?style=for-the-badge&logo=springboot"/>
<img src="https://img.shields.io/badge/Spring_MVC-blue?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/Spring_JDBC-darkgreen?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/H2_Database-lightblue?style=for-the-badge&logo=h2"/>
<img src="https://img.shields.io/badge/Lombok-red?style=for-the-badge"/>
</p>

---

## ⚙️ Como instalar e rodar localmente

### 🔧 Pré-requisitos

- Java 21
- Maven

---

### 💻 Rodando localmente

```bash
git clone https://github.com/vineog23-boop/LocalTech.git
cd LocalTech
mvn clean install
mvn spring-boot:run
```

Acesse:

- API: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`

---

## 📂 Estrutura do projeto

```
src/
 ├── controllers/
 │    └── veiculoController.java
 ├── entities/
 │    ├── Aluguel.java
 │    ├── Pessoa.java
 │    └── Veiculo.java
 ├── repository/
 │    ├── VeiculoRepository.java
 │    └── VeiculoRepositoryImp.java
 └── service/
      └── VeiculoService.java
```

---

## 🧠 Conceitos aplicados

### 🔸 Arquitetura em camadas
- Separação clara entre **Controller → Service → Repository**

### 🔸 Spring MVC REST
- Criação de endpoints REST com `@RestController` e mapeamentos HTTP

### 🔸 Spring JDBC
- Persistência com `JdbcTemplate` para operações no banco

### 🔸 Banco em memória
- Uso do **H2** para desenvolvimento e testes rápidos

### 🔸 Lombok
- Redução de boilerplate com `@Data`, `@Builder`, `@NoArgsConstructor`

---

## 👨‍💻 Autor

Projeto desenvolvido por **Vinícius Gonçalves** como parte dos estudos em **Java Backend** — FIAP Pós-Tech 🚀
