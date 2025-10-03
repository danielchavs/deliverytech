# Delivery Tech API

This project is fully documented in English and Brazilian Portuguese.
*Este projeto está totalmente documentado em Inglês e Português do Brasil.*

<br>

<details>
<summary><strong>🇧🇷 Ver em Português</strong></summary>

## Delivery Tech API (PT-BR)

API backend desenvolvida em **Java 21** com **Spring Boot 3.x**, servindo como base para um sistema de delivery moderno e escalável. Este projeto foi criado como parte de um curso de Arquitetura de Sistemas.

### ✨ Funcionalidades

O objetivo inicial deste projeto é fornecer uma fundação sólida para as funcionalidades de um sistema de delivery, incluindo:

* Catálogo de produtos
* Gerenciamento de pedidos
* Cadastro de clientes
* Gerenciamento de restaurantes

### 🛠️ Tecnologias e Ferramentas

Este projeto foi construído utilizando tecnologias modernas para garantir performance e segurança.

* **Java 21 LTS:** A versão mais recente de Suporte a Longo Prazo do Java.
* **Spring Boot 3.x:** Para desenvolvimento rápido e com configuração simplificada.
* **Spring Data JPA:** Para persistência de dados.
* **H2 Database:** Banco de dados em memória para o ambiente de desenvolvimento.
* **Maven:** Para gerenciamento de dependências.
* **Spring Boot Actuator:** Fornece endpoints de monitoramento como o `/health`.

### 🚀 Como Executar

#### Pré-requisitos

* **JDK 21** ou superior instalado.
* **Apache Maven** instalado.
* **Git** instalado.

#### Passos

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/danielchavs/deliverytech.git](https://github.com/danielchavs/deliverytech.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd deliverytech/delivery-api
    ```

3.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

4.  **Acesse a aplicação:** A API estará disponível em `http://localhost:8080`.

### 📡 Endpoints

Os seguintes endpoints estão disponíveis para teste e gerenciamento:

* `GET /health`: Verifica o status de "saúde" da aplicação. Retorna um JSON com `"status": "UP"` e a versão atual do Java.
* `GET /info`: Retorna informações básicas sobre a aplicação.
* `GET /h2-console`: Abre o console web do banco de dados H2 em memória.

### ⚙️ Configuração

As principais configurações estão no arquivo `src/main/resources/application.properties`:

* **Porta:** `8080`
* **Banco de Dados:** H2 em memória
* **Perfil:** `default`

### 👨‍💻 Desenvolvedor

* **Daniel Chaves**
* **JDK:** 21
* **Framework:** Spring Boot 3.x

</details>

<br>

<details>
<summary><strong>🇬🇧 View in English</strong></summary>

## Delivery Tech API (EN)

API backend developed in **Java 21** with **Spring Boot 3.x**, serving as a base for a modern and scalable delivery system. This project was created as part of a Systems Architecture course.

### ✨ Features

The initial goal of this project is to provide a solid foundation for delivery system functionalities, including:

* Product catalog
* Order management
* Customer registration
* Restaurant management

### 🛠️ Technologies & Tools

This project was built using the latest stable technologies to ensure performance and security.

* **Java 21 LTS:** The latest Long-Term Support version of Java.
* **Spring Boot 3.x:** For rapid and configuration-simplified development.
* **Spring Data JPA:** For data persistence.
* **H2 Database:** In-memory database for the development environment.
* **Maven:** For dependency management.
* **Spring Boot Actuator:** Provides monitoring endpoints like `/health`.

### 🚀 How to Run

#### Prerequisites

* **JDK 21** or higher installed.
* **Apache Maven** installed.
* **Git** installed.

#### Steps

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/danielchavs/deliverytech.git](https://github.com/danielchavs/deliverytech.git)
    ```

2.  **Navigate to the project directory:**
    ```bash
    cd deliverytech/delivery-api
    ```

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

4.  **Access the application:** The API will be available at `http://localhost:8080`.

### 📡 Endpoints

The following endpoints are available for testing and management:

* `GET /health`: Checks the application's health status. Returns a JSON with `"status": "UP"` and the current Java version.
* `GET /info`: Returns basic information about the application.
* `GET /h2-console`: Opens the web console for the H2 in-memory database.

### ⚙️ Configuration

The main settings are in the `src/main/resources/application.properties` file:

* **Port:** `8080`
* **Database:** H2 in-memory
* **Profile:** `default`

### 👨‍💻 Developer

* **Daniel Chaves**
* **JDK:** 21
* **Framework:** Spring Boot 3.x

</details>
