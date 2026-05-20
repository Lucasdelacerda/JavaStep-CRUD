# 🚀 JavaStep-CRUD

API REST desenvolvida com **Java** e **Spring Boot** para praticar os fundamentos de um CRUD de usuários, validação de dados, persistência com JPA e criptografia de senhas.

![Java](https://img.shields.io/badge/Java-25-red?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.7-brightgreen?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven)
![H2](https://img.shields.io/badge/H2-Database-lightgrey?style=for-the-badge)

---

## 📚 Sobre o projeto

O **JavaStep-CRUD** é uma API simples para cadastro, listagem, busca e remoção de usuários. O projeto foi criado como estudo prático de desenvolvimento back-end com Spring Boot e está evoluindo aos poucos para seguir padrões mais próximos de aplicações corporativas.

Atualmente, a aplicação utiliza banco de dados **H2 em memória**, validações com **Jakarta Validation** e criptografia de senha com **BCrypt**.

---

## ✨ Funcionalidades

- ✅ Cadastro de usuários
- ✅ Listagem de usuários
- ✅ Busca de usuário por e-mail
- ✅ Remoção de usuário por ID
- ✅ Validação de e-mail
- ✅ Validação de senha forte
- ✅ Criptografia de senha com BCrypt
- ✅ Banco H2 para ambiente de desenvolvimento

---

## 🛠️ Tecnologias utilizadas

- ☕ **Java 25**
- 🍃 **Spring Boot 3.5.7**
- 🌐 **Spring Web**
- 🗃️ **Spring Data JPA**
- ✅ **Jakarta Validation**
- 🔐 **Spring Security Crypto**
- 🧪 **H2 Database**
- 📦 **Maven**
- 🧰 **Lombok**

---

## 📁 Estrutura do projeto

```text
src
└── main
    ├── java
    │   └── com/Scrimet/JavaStep
    │       ├── controller
    │       ├── entitys
    │       ├── repository
    │       ├── service
    │       ├── JavaStepApplication.java
    │       └── SecurityConfig.java
    └── resources
        └── application.properties
```

---

## 🚦 Endpoints

Base URL:

```http
http://localhost:8082
```

| Método | Endpoint | Descrição |
| --- | --- | --- |
| `POST` | `/usuario` | Cadastra um novo usuário |
| `GET` | `/usuario` | Lista todos os usuários |
| `GET` | `/usuario/{email}` | Busca um usuário por e-mail |
| `DELETE` | `/usuario/{id}` | Remove um usuário pelo ID |

### 📌 Exemplo de cadastro

```json
{
  "email": "usuario@email.com",
  "nome": "Lucas",
  "password": "Senha@123"
}
```

> A senha precisa ter no mínimo 6 caracteres, uma letra maiúscula e um caractere especial.

---

## ▶️ Como executar o projeto

### ✅ Pré-requisitos

Antes de começar, você precisa ter instalado:

- Java 25
- Maven
- Git

### 📥 Clone o repositório

```bash
git clone https://github.com/seu-usuario/JavaStep-CRUD.git
cd JavaStep-CRUD
```

### ▶️ Execute com Maven

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A API ficará disponível em:

```http
http://localhost:8082
```

---

## 🧪 Banco de dados H2

O console do H2 fica disponível em:

```http
http://localhost:8082/h2-console
```

Configurações padrão:

| Campo | Valor |
| --- | --- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| User | `sa` |
| Password | vazio |

---

## 🗺️ Roadmap

### 🔐 Segurança e autenticação

- [x] Criptografia de senha com BCrypt
- [ ] Implementar autenticação com Spring Security
- [ ] Implementar autenticação JWT
- [ ] Criar fluxo de login

### 🧱 Arquitetura

- [ ] Criar DTOs para entrada e saída de dados
- [ ] Separar melhor as responsabilidades entre camadas
- [ ] Implementar tratamento global de exceções com `@ControllerAdvice`
- [ ] Padronizar respostas da API

### 🧪 Qualidade

- [ ] Criar testes unitários
- [ ] Criar testes de integração
- [ ] Adicionar documentação com Swagger/OpenAPI

### 🐳 DevOps e produção

- [ ] Migrar para PostgreSQL
- [ ] Criar Dockerfile
- [ ] Criar `docker-compose.yml`
- [ ] Preparar configuração por ambiente

---

## 🤝 Como contribuir

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch para sua feature
3. Faça commit das suas alterações
4. Abra um Pull Request

---

## 👨‍💻 Autor

Feito por **Lucas de Lacerda**.

🔗 [LinkedIn](https://www.linkedin.com/in/lucas-de-lacerda-066316186/)

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
