# Gerador de Frases (Séries) - Back-end API

Uma API REST desenvolvida em **Java** e **Spring Boot** que serve como back-end para uma aplicação de exibição de frases marcantes de séries. Este projeto foi o desafio final do curso **"Java: trabalhando com Lambdas, Streams e Spring Framework"** (ou a continuação de Web) da Alura.

O grande objetivo deste desafio foi construir a inteligência do servidor (Back-end) do zero e integrá-la com uma aplicação de Front-end pronta (em JavaScript/HTML/CSS) disponibilizada pela Alura, solucionando problemas reais de comunicação de rede como o **CORS**.

## Funcionalidades da API

- **Endpoint de Frase Aleatória (`/series/frases`):** Retorna uma frase randômica do banco de dados, contendo o texto da frase, o personagem que a disse, o nome da série e um pôster correspondente.
- **Integração Completa:** Comunicação direta com a interface visual (Front-end), atualizando a tela do usuário a cada clique no botão de nova frase.

## Tecnologias e Conceitos Utilizados

- **Java 17** 
- **Spring Boot & Spring Data JPA:** Para criação dos endpoints REST e gerenciamento das consultas ao banco de dados.
- **Banco de Dados PostgreSQL:** Armazenamento das séries, personagens e suas respectivas frases.
- **Configuração de CORS (@CrossOrigin):** Implementação do controle de acesso para permitir que o Front-end (rodando em uma porta ou servidor diferente) consumisse os dados da API sem bloqueios de segurança.
- **Derived Queries / Native Queries:** Uso do Spring Data para buscar registros de forma aleatória diretamente no banco de dados (ex: `ORDER BY RANDOM() LIMIT 1`).
- **Data Transfer Objects (DTO):** Uso de Java **Records** para estruturar os dados que são enviados ao Front-end de forma limpa, segura e performática.

## Arquitetura do Projeto

O projeto foi estruturado seguindo o padrão MVC/Camadas clássico do desenvolvimento Web:
- `model/`: Contém a entidade `Frase` mapeada para o banco de dados e o Record `FraseDTO`.
- `repository/`: Interface que gerencia a comunicação com o banco e a lógica de busca aleatória.
- `service/`: Classe responsável pela regra de negócio (seleção da frase).
- `controller/`: Camada que expõe o endpoint HTTP para o Front-end.
- `config/`: Configurações globais ou específicas de CORS (caso não tenha usado a anotação direta).

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com
   ```
2. Abra o projeto no **IntelliJ IDEA**.
3. Certifique-se de configurar a sua base de dados no arquivo `application.properties`.
4. Execute a aplicação Spring Boot (a API rodará por padrão na porta `8080`).
5. Abra o projeto do Front-end disponibilizado pela Alura no seu navegador e clique em "Obter Frase"!

## Exemplo de Resposta do Endpoint (JSON)

Ao acessar `http://localhost:8080/series/frases`, a API retorna um JSON estruturado assim:

```json
{
  "titulo": "Breaking Bad",
  "frase": "I am the one who knocks!",
  "personagem": "Walter White",
  "poster": "https://link-da-imagem.com"
}
```

---
Desafio desenvolvido com fins educacionais como parte do ecossistema de aprendizado da **Alura**.
