# CRUD de Usuários com Spring Boot ☕

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white) 
![Spring Boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot) 
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) 
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) 
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)

---

### 📋 Sobre o Projeto

Este é um projeto de estudo que implementa um **CRUD (Create, Read, Update, Delete)** completo para gerenciamento de usuários. A aplicação foi construída com **Spring Boot** no backend, servindo uma API RESTful para manipulação dos dados, e um frontend simples em **HTML, CSS e JavaScript** que consome essa API.

O objetivo principal foi demonstrar a integração entre a camada de apresentação (frontend) e a camada de negócio e persistência (backend), utilizando as melhores práticas do ecossistema Spring.

---

### 🚀 Funcionalidades

- **Criação de Usuário:** `POST /salvar`
- **Listagem de Usuários:** `GET /listatodos`
- **Busca por ID:** `GET /buscarUserId`
- **Busca por Nome:** `GET /buscarPorNome`
- **Atualização de Usuário:** `PUT /atualizar`
- **Exclusão de Usuário:** `DELETE /delete`

---

### 💻 Tecnologias Utilizadas

**Backend:**
- **Java 17:** Linguagem de programação.
- **Spring Boot:** Framework para o desenvolvimento rápido de aplicações.
- **Spring Data JPA:** Simplifica a interação com o banco de dados.
- **Hibernate:** Implementação da especificação JPA.
- **Banco de Dados PostgreSQL:** Banco de dados relacional PostgreSQL para salvar os dados.
- **Maven:** Gerenciador de dependências.

**Frontend:**
- **HTML5:** Estrutura da página.
- **CSS3:** Estilização da interface.
- **JavaScript:** Lógica para requisições AJAX e manipulação do DOM.
- **Bootstrap 5:** Framework de CSS para design responsivo.
- **jQuery:** Biblioteca de JavaScript para simplificar a manipulação do DOM e requisições AJAX.

---

### ⚙️ Configuração do Banco de Dados

A aplicação utiliza o **PostgreSQL** como banco de dados. A configuração de conexão está no arquivo `src/main/resources/application.properties`.

O Spring Data JPA, através da propriedade `spring.jpa.hibernate.ddl-auto=update`, se encarrega de criar e atualizar a tabela `usuario` no banco de dados automaticamente, com base na sua entidade `Usuario.java`.

Para conectar ao seu próprio banco de dados, basta alterar as seguintes linhas no arquivo de propriedades:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome-do-seu-banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

### 🛠️ Como Executar o Projeto

1.  **Pré-requisitos:**
    - Java JDK 17 ou superior
    - Maven
    - Uma IDE (como STS, IntelliJ, VS Code, Eclipse IDE)

2.  **Clone o repositório:**
    ```bash
    git clone https://github.com/marcosarantesj/crud-springboot1.git
    ```

3.  **Abra o projeto na sua IDE:**
    - Importe o projeto Maven na sua IDE.

4.  **Execute a aplicação:**
    - Execute a classe principal `CrudSpringBootApplication.java`.
    - A aplicação estará disponível em `http://localhost:8000`.

---

### 🔮 Próximos Passos (Evoluções Possíveis)

Este projeto serve como uma base sólida. Para torná-lo ainda mais robusto e completo, as seguintes melhorias podem ser implementadas:

- **Segurança:** Adicionar **Spring Security** para autenticação (login) e autorização de usuários.
- **Validação:** Implementar a **Bean Validation API** para garantir a integridade dos dados na entrada (`@Valid`, `@NotBlank`, etc.).
- **Tratamento de Exceções:** Criar classes de exceção personalizadas e usar `@ControllerAdvice` para um tratamento de erros global e padronizado.
- **Testes Automatizados:** Escrever testes de unidade (com JUnit e Mockito) e de integração para os endpoints da API.
- **Documentação da API:** Gerar documentação da API usando **OpenAPI (Swagger)**.
