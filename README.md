## Sales Data Analysis Chalenge

Plataforma que realiza a análise de dados provenientes de um diretório especificado, gerando um relatório final.

## Dependências

- Java Development Kit (versão 8)
- Maven (versão 3.3 ou maior)

## Instalando a aplicação

Execute o comando para clonar o projeto:

```bash
git clone https://github.com/lbotton/sda
```
Acesse a pasta do projeto copiado por linha de comando;

Execute o comando para instalar o projeto

```bash
mvn install
```

Inicie a aplicação com o comando (não executa os testes)

```bash
mvn exec:java
```

Após a inicialização insira o arquivo in.txt no seu diretório /Users/data/in.
Verifique o resultado gerado no diretório /Users/data/out.

O diretório /Users é o HOMEPATH do seu sistema operacional.

## Overview

O projeto utiliza Maven como gestor de dependências, NIO para monitoramento do sistema de arquivos e JUnit para testes.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)