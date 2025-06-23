# Conversor de Moedas em Java

Este projeto é uma aplicação de conversão de moedas desenvolvida em Java. Abaixo estão as instruções sobre como configurar, compilar e executar a aplicação, além de informações sobre a estrutura do projeto e como contribuir.

## Estrutura do Projeto

```
conversor-moedas-java
├── src
│   └── Main.java          # Classe principal onde a aplicação é iniciada
├── .gitignore             # Arquivo que especifica quais arquivos devem ser ignorados pelo Git
├── pom.xml                # Arquivo de configuração do Maven para gerenciamento de dependências
└── README.md              # Documentação do projeto
```

## Configuração do Projeto

1. **Clone o repositório:**
   ```
   git clone <URL_DO_REPOSITORIO>
   cd conversor-moedas-java
   ```

2. **Instale as dependências:**
   Certifique-se de ter o Maven instalado e execute o seguinte comando:
   ```
   mvn install
   ```

## Compilação e Execução

Para compilar e executar a aplicação, utilize os seguintes comandos:

```
mvn compile
mvn exec:java -Dexec.mainClass="Main"
```

## Contribuição

Para contribuir com o projeto, siga a estratégia de branching Git Flow descrita abaixo.

### Estratégia de Branching Git Flow

1. **Branch principal `master`:**
   - Contém a versão mais estável e pronta para produção do projeto.

2. **Branch `develop`:**
   - Crie a branch `develop` a partir da branch `master` para desenvolvimento ativo.
   - Comando: `git checkout -b develop master`

3. **Feature Branches:**
   - Para cada nova funcionalidade, crie uma branch no formato `feature/nome-da-funcionalidade` a partir da branch `develop`.
   - Exemplo: `feature/implementa-conversao-euro`
   - Comando: `git checkout -b feature/implementa-conversao-euro develop`
   - Após concluir a funcionalidade, faça um pull request (PR) para mesclar de volta na branch `develop`.

4. **Release Branches:**
   - Quando estiver pronto para lançar uma nova versão, crie uma branch `release/x.y` a partir da branch `develop`, onde `x.y` representa a nova versão do software.
   - Comando: `git checkout -b release/1.0 develop`
   - Realize testes finais e correções antes de mesclar de volta na branch `master` e `develop`.

5. **Hotfix Branches:**
   - Em caso de bugs críticos na produção, crie uma branch `hotfix/nome-do-bug` a partir da branch `master`.
   - Comando: `git checkout -b hotfix/corrige-bug-critico master`
   - Após a correção, mescle a branch de hotfix de volta à branch `master` e à branch `develop`.

### Comandos Git Exemplares

- Criação de uma nova branch: `git checkout -b nome-da-branch`
- Mudança para uma branch existente: `git checkout nome-da-branch`
- Mesclagem de uma branch: `git merge nome-da-branch`

Esta documentação deve fornecer diretrizes claras para desenvolvedores que trabalham no projeto, aumentando a colaboração e a organização no desenvolvimento.