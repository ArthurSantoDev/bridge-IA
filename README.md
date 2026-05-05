# 🌉 Bridge-IA

> Ponte de contexto entre modelos de Inteligência Artificial — estude sem interrupções.

---

## 📌 Sobre o Projeto

**Bridge-IA** é uma aplicação backend que resolve um problema real de quem usa IAs como ferramenta de estudo: a perda de contexto quando o limite de tokens de um modelo é atingido.

Com o Bridge-IA, o histórico de conversas é persistido em banco de dados, permitindo que o usuário continue exatamente de onde parou — seja no Claude, seja no Gemini — sem perder nenhuma informação da sessão de estudo.

---

## 🚩 Problema que Resolve

Modelos de IA como Claude e Gemini possuem limites de tokens por sessão. Quando esse limite é atingido, o contexto da conversa se perde e o usuário precisa recomeçar do zero.

O Bridge-IA elimina esse problema ao:
- Salvar todo o histórico de conversas no banco de dados
- Gerar um **pacote de contexto** estruturado ao trocar de modelo
- Permitir retomar a sessão em outro modelo sem perda de informação

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java 21 | Linguagem principal |
| Spring Boot 3.5 | Framework backend |
| Spring WebFlux | Comunicação reativa com APIs externas (streaming) |
| Spring Data JPA | Persistência e mapeamento de dados |
| PostgreSQL | Banco de dados relacional |
| Maven | Gerenciamento de dependências |

---

## 🏗️ Arquitetura

O projeto segue a arquitetura em camadas padrão do Spring Boot:

```
Controller  →  recebe as requisições HTTP
Service     →  contém toda a lógica de negócio
Repository  →  acesso ao banco de dados
```

As chamadas às APIs externas (Claude e Gemini) são feitas de forma **assíncrona e reativa** via `WebClient`, utilizando `Flux<String>` para suportar respostas em streaming.

---

## 🎯 Contexto de Desenvolvimento

Este projeto foi desenvolvido como **campo de provas prático**, aplicando conceitos de:
- Arquitetura em camadas
- Programação reativa e assíncrona
- Integração com APIs externas
- Persistência de dados com JPA/Hibernate
- Boas práticas de separação de responsabilidades (SOLID)

---

## 🚀 Como Executar

> Em breve — documentação em construção conforme o projeto evolui.

---

## 👨‍💻 Autor

**Arthur** — Desenvolvedor Backend Java  
Estudante de Engenharia de Software | Foco em Back-end com Java e Spring Boot
