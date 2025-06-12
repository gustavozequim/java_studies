# 🛠️ Roadmap Backend – 1h/dia

## 📊 Visão Geral
- **Início:** [data de início]
- **Horas por dia:** 1 h (6× por semana, com um dia de revisões)
- **Total estimado:** ~6 semanas

## ✅ Status
- 🟩 Em andamento  
- ✅ Concluído  
- ⬜ Não iniciado

---

## 🔰 Fase 1 – Fundamentos de Programação (2 semanas)

| Dia  | Tópico                                | Exercício prático                                  | Status |
|------|---------------------------------------|-----------------------------------------------------|--------|
| 1.1  | Lógica básica (condições, laços)      | Escreva um programa que valida se um número é par. | ✅     |
| 1.2  | Variáveis e tipos em Java             | Crie variáveis para usuário (nome, idade, altura).| ✅     |
| 1.3  | Controle (if, switch)                 | Faça um menu de opções simples.                    | 🟩     |
| 1.4  | Loops (for, while)                    | Gere a tabuada de um número.                      | ⬜     |
| 1.5  | Funções e métodos                     | Crie uma função que calcula fatorial.             | ⬜     |
| 1.6  | Classes e objetos                     | Modele uma classe `Pessoa` com atributos.         | ⬜     |
| 1.7  | Revisão + exercícios                  | Monte todos os exercícios anteriores num projeto. | ⬜     |
| 2.1  | POO: herança e polimorfismo           | Crie classes `Animal`, `Cachorro`, `Gato`.        | ⬜     |
| 2.2  | Tratamento de exceções                | Implemente tratamento ao dividir por zero.        | ⬜     |
| 2.3  | Coleções (List, Set, Map)             | Armazene contatos de telefone usando Map.         | ⬜     |
| 2.4  | Java 8+: lambdas e streams            | Filtre uma lista de números pares.                | ⬜     |
| 2.5  | CRUD em memória                       | Crie uma lista simulando CRUD (add, edit, del).  | ⬜     |
| 2.6  | Projeto: gerenciador de tarefas       | App console com tarefas + status (feito/não).     | ⬜     |
| 2.7  | Revisão geral + Git básico            | Suba o projeto no GitHub com readme.              | ⬜     |

---

## ⚙️ Fase 2 – Spring Boot + API (2 semanas)

| Dia  | Tópico                                  | Exercício prático                                                    | Status |
|------|-----------------------------------------|-----------------------------------------------------------------------|--------|
| 3.1  | Setup do Spring Boot                    | Crie um projeto Spring Boot básico.                                   | ⬜     |
| 3.2  | Endpoints REST (GET, POST)             | Crie `/hello` e `/echo` via Postman.                                 | ⬜     |
| 3.3  | MySQL + Spring Data JPA                | Conecte banco MySQL e crie tabela `Produto`.                         | ⬜     |
| 3.4  | Entidades e repositórios               | Crie `Produto` com id, nome, preço + repositório.                    | ⬜     |
| 3.5  | Camadas Service + Controller           | Separe lógica de negócios e endpoints.                               | ⬜     |
| 3.6  | Validação com @Valid                   | Valide campos de entidade `Produto`.                                 | ⬜     |
| 3.7  | Testes de API com Postman              | Teste endpoints de CRUD de `Produto`.                                | ⬜     |
| 4.1  | Métodos PUT e DELETE                   | Implemente atualização e exclusão de produto.                        | ⬜     |
| 4.2  | Exceções com @ControllerAdvice         | Crie tratamento global para `ResourceNotFoundException`.             | ⬜     |
| 4.3  | Documentação via Swagger               | Adicione Swagger UI à sua API.                                       | ⬜     |
| 4.4  | Introdução ao Spring Security          | Adicione segurança básica (in-memory users).                         | ⬜     |
| 4.5  | Autenticação com JWT                   | Implemente login via JWT e proteja endpoints.                        | ⬜     |
| 4.6  | Projeto: API de usuários               | Crie API CRUD de `Usuário` com email, senha e registros.             | ⬜     |
| 4.7  | Revisão geral                          | Teste tudo novamente + atualize docs.                                | ⬜     |

---

## 🧪 Fase 3 – Boas práticas & testes (1 semana)

| Dia  | Tópico                                       | Exercício prático                                                      | Status |
|------|----------------------------------------------|-------------------------------------------------------------------------|--------|
| 5.1  | Camadas: Controller, Service, Repository     | Refatore API para respeitar camadas.                                   | ⬜     |
| 5.2  | SOLID e Clean Code                           | Revise código e separe responsabilidades.                              | ⬜     |
| 5.3  | Testes unitários (JUnit)                     | Escreva testes para service de `Produto`.                             | ⬜     |
| 5.4  | Mocking (Mockito)                            | Simule repositório em testes unitários.                                | ⬜     |
| 5.5  | DTOs + Mapper                                | Adicione DTO de entrada/saída e mapeie com MapStruct.                  | ⬜     |
| 5.6  | Refatoração com boas práticas                | Aplique melhorias com base no SOLID.                                   | ⬜     |
| 5.7  | Revisão + commits no GitHub                  | Finalize com versionamento e descrição completa no readme.             | ⬜     |

---

## ☁️ Fase 4 – Deploy + CI/CD (1 semana)

| Dia  | Tópico                                               | Exercício prático                                                       | Status |
|------|------------------------------------------------------|------------------------------------------------------------------------|--------|
| 6.1  | GitHub: branches + pull requests                     | Crie branch `feature/jwt`, abra PR e faça merge após revisão.         | ⬜     |
| 6.2  | Docker básico                                        | Escreva Dockerfile para a API de produto/usuário.                     | ⬜     |
| 6.3  | Dockerizar app                                      | Gere imagem Docker e execute localmente.                              | ⬜     |
| 6.4  | Deploy (Render, Railway ou Heroku)                   | Hospede imagem Docker e teste endpoints públicos.                     | ⬜     |
| 6.5  | GitHub Actions (build e test)                        | Crie workflow que roda testes a cada push.                            | ⬜     |
| 6.6  | Projeto: pipeline + deploy automático                | Adicione deploy no GitHub Actions após merge na `main`.              | ⬜     |
| 6.7  | Revisão + checklist final                            | Confirme deploy, CI/CD, testes e atualize readme com badge.          | ⬜     |

---

## 📝 Recursos de Estudo
- Lógica: Curso em Vídeo  
- Java básico: Loiane Training  
- Spring Boot + MySQL: Michelli Brito  
- Git e GitHub: Curso em Vídeo  
- Docker: documentação oficial  
- CI/CD: documentação GitHub Actions  
