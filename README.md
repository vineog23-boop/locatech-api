<h1 align="center">🚗 Locatech API</h1>
<p align="center">Estudos de modelagem de locação de veículos e persistência com JDBC.</p>
<p align="center">
  <img src="https://img.shields.io/badge/Java-21-2563EB?style=flat-square" alt="Java: 21">
  <img src="https://img.shields.io/badge/Spring%20Boot-4.0.5-0F766E?style=flat-square" alt="Spring Boot: 4.0.5">
  <img src="https://img.shields.io/badge/Status-Estrutura%20inicial-475569?style=flat-square" alt="Status: Estrutura inicial">
</p>

<p align="center"><a href="#visão-geral">Visão geral</a> · <a href="#como-executar">Execução</a> · <a href="#próximos-passos">Próximos passos</a></p>

---

## Visão geral

Projeto acadêmico para explorar um backend de locação de veículos. O repositório contém modelos de veículo, pessoa e aluguel, uma interface de persistência e a estrutura inicial de controller e service.

**O CRUD ainda não está disponível via HTTP.** A única rota implementada é `GET /veiculos`, cujo retorno é o texto `Veiculo`.

## Estado do código

| Parte | Situação |
| --- | --- |
| Modelagem | Classes `Veiculo`, `Pessoa` e `Aluguel`. |
| Controller | Endpoint demonstrativo de leitura. |
| Service | Classe criada, ainda sem operações. |
| Repository | Interface com assinaturas de consulta, inclusão, atualização e exclusão. |
| Implementação JDBC | Rascunho em `VeiculoRepositoryImp.java`; ainda não está integrado. |
| Banco | H2 e Spring JDBC nas dependências; sem schema SQL versionado. |

O arquivo `VeiculoRepositoryImp.java` começa com um comentário de bloco sem fechamento. Esse trecho precisa ser corrigido antes de um build completo; a documentação não considera o projeto executável como CRUD neste checkpoint.

## Tecnologias

| Tecnologia | Uso |
| --- | --- |
| Java 21 | Linguagem |
| Spring Boot 4.0.5 | Aplicação |
| Spring Web MVC | Camada HTTP |
| Spring JDBC / JdbcClient | Persistência SQL em estudo |
| H2 | Dependência de banco embarcado |
| Lombok e Maven Wrapper | Desenvolvimento e build |

## Como executar

Primeiro, clone e abra o projeto com **JDK 21**:

```bash
git clone https://github.com/vineog23-boop/locatech-api.git
cd locatech-api
```

Após corrigir o comentário de bloco e completar a configuração necessária:

```bash
bash ./mvnw spring-boot:run
```

No Windows: `.\mvnw.cmd spring-boot:run`.

A rota demonstrativa será `http://localhost:8080/veiculos`. O arquivo `application.properties` só define o nome da aplicação; o console H2 ainda não está habilitado explicitamente.

## Organização

| Pacote | Objetivo |
| --- | --- |
| `controllers` | Receber requisições HTTP. |
| `entities` | Modelar veículos, pessoas e aluguéis. |
| `repository` | Definir e implementar acesso SQL. |
| `service` | Concentrar as operações da aplicação. |

## Testes

Há um teste de contexto Spring no repositório. O comando é `bash ./mvnw test`, condicionado à correção do bloqueio de compilação. Não há uma suíte de CRUD implementada.

## Próximos passos

- Corrigir e integrar a implementação de `VeiculoRepository`.
- Criar o schema do banco e configurar a persistência.
- Implementar service, DTOs e endpoints do CRUD.
- Validar entradas e testar sucesso, ausência de registros e falhas.

## Autor

**Vinícius Oliveira** · [GitHub](https://github.com/vineog23-boop) · [LinkedIn](https://www.linkedin.com/in/vinícius-oliveira-1770b7306)
