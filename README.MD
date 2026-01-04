# 🚀 JavaStep-CRUD

Este é um projeto de CRUD (Create, Read, Update, Delete) de usuários com foco em autenticação. Iniciado como um estudo de fundamentos em Spring Boot, o projeto está em constante evolução, seguindo as melhores práticas de desenvolvimento corporativo.

## 🛠 Tecnologias
*   **Java 21**
*   **Spring Boot**
*   **Spring Data JPA**
*   **H2 Database** (para desenvolvimento) / **PostgreSQL**
*   **Jakarta Validation** (Bean Validation)

## 📌 Funcionalidades Atuais
- [x] Cadastro de usuários com validação de e-mail e senha.
- [x] Listagem de todos os usuários.
- [x] Busca de usuário por e-mail (Query Methods).
<!--- [x] Tratamento de erros para rotas duplicadas e dados inválidos.-->

## 🚀 Como Executar
1. Clone o repositório: `git clone github.com`
2. Importe como um projeto Maven na sua IDE.
3. Execute a classe principal `EstudoCrudApplication`.
4. A API estará disponível em `http://localhost:8080`.

---

## 📈 Roadmap de Evolução (Próximos Passos)
O diferencial deste projeto é sua evolução contínua. As melhorias planejadas são:

### Fase 1: Arquitetura e Segurança (Em breve)
- [ ] **Implementação de DTOs**: Separar as entidades de banco de dados da camada de visualização.
- [ ] **Spring Security + JWT**: Implementar login real com geração de tokens seguros.
- [ ] **Criptografia de Senhas**: Uso de BCrypt para não salvar senhas em texto puro.

### Fase 2: Robustez e Qualidade
- [ ] **Tratamento de Exceções Global**: Criar um `@ControllerAdvice` para respostas de erro padronizadas.
- [ ] **Testes Unitários**: Cobertura de testes com JUnit e Mockito.
- [ ] **Documentação Swagger (OpenAPI)**: Interface interativa para testar os endpoints.

### Fase 3: DevOps e Persistência
- [ ] **Migração para PostgreSQL**: Sair do banco em memória para um banco persistente.
- [ ] **Dockerização**: Criar um Dockerfile para facilitar o deploy da aplicação.

---
📝 **Autor:** Lucas de Lacerda - [Linkedin](https://www.linkedin.com/in/lucas-de-lacerda-066316186/)