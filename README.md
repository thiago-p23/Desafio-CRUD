# Desafio-CRUD: Sistema de Cadastro de Alunos em Java

## Descrição

Este projeto consiste em um sistema de cadastro de alunos desenvolvido em Java 21 utilizando conceitos fundamentais de programação.
O sistema funciona através de um menu interativo no terminal, permitindo realizar operações de cadastro, consulta, listagem e remoção de alunos.
Os dados são armazenados temporariamente em memória utilizando arrays.

---

## Objetivo

Praticar os principais conceitos estudados no curso de Desenvolvimento de Sistemas:

- Variáveis
- Arrays
- Estruturas condicionais
- Estruturas de repetição
- Menus interativos
- Manipulação de dados
- Organização lógica do código

---

## Dados Armazenados

Cada aluno possui:

- Nome
- Idade
- Curso

Os dados são armazenados em três arrays:

```java
String[] nomes = new String[10];
int[] idades = new int[10];
String[] cursos = new String[10];
```

Também é utilizada uma variável de controle:

```java
int totalAlunos = 0;
```

---

## Funcionalidades

### 1 Cadastrar Aluno

Permite cadastrar até 10 alunos.

Validações implementadas:

- Não permite nome vazio.
- Impede cadastro acima do limite máximo.

---

### 2 Listar Alunos

Exibe todos os alunos cadastrados.

Caso não existam registros:

```text
Nenhum aluno cadastrado.
```

---

### 3 Buscar Aluno

Pesquisa um aluno pelo nome.

A busca ignora letras maiúsculas e minúsculas.

Exemplo:

```text
Ana
ANA
ana
AnA
```

Todos serão encontrados normalmente.

---

### 4 Remover Aluno

Permite remover um aluno pelo nome.

Antes da exclusão o sistema solicita confirmação:

```text
Deseja realmente remover este aluno? (S/N)
```

Após a remoção:

- Os arrays são reorganizados.
- Não ficam posições vazias entre os registros.

---

### 5 Encerrar Sistema

Finaliza o programa exibindo:

```text
Sistema encerrado.
```

---

## Conceitos Utilizados

- Java 21
- Arrays
- Estruturas de repetição (`while` e `for`)
- Estruturas condicionais (`if` e `else`)
- `switch case`
- Entrada de dados com `readln()`
- Manipulação de Strings
- Busca em arrays
- Remoção e reorganização de registros

---

## Armazenamento dos Dados

Nesta versão, os dados ficam armazenados apenas na memória do programa.

Isso significa que:

- ao fechar o sistema;
- ao reiniciar o computador;
- ou executar novamente o programa;

todos os cadastros serão perdidos.

---

## Próximas Melhorias

As próximas versões poderão incluir:

- Persistência de dados em arquivos;
- Leitura automática dos cadastros ao iniciar;
- Alteração de dados dos alunos;
- Busca por curso;
- Ordenação de alunos;
- Interface gráfica.

---

## Finalidade Educacional

Este projeto foi desenvolvido com o objetivo de praticar lógica de programação e os fundamentos da linguagem Java, servindo como base para projetos mais avançados durante o curso de Desenvolvimento de Sistemas.
