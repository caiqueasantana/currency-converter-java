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

