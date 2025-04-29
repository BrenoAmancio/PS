# Calculadora Java

## 📝 Descrição
Este é um projeto de uma calculadora simples desenvolvida em Java. A aplicação realiza operações matemáticas básicas (soma, subtração, multiplicação e divisão) e utiliza uma interface de linha de comando para interação com o usuário. O projeto segue uma arquitetura modular e utiliza o padrão Factory para criação dinâmica de operações.

## 🚀 Como Executar o Projeto

### 1. Pré-requisitos
Antes de começar, certifique-se de ter os seguintes itens instalados em sua máquina:
- **Java Development Kit (JDK) 23 ou superior**
- **Apache Maven** (para gerenciamento de dependências e execução do projeto)

### 2. Clonar o Repositório
Clone o repositório para sua máquina local:
```bash
git clone https://github.com/BrenoAmancio/PS.git
```

### 3. Navegar até o Diretório do Projeto
Acesse o diretório onde o projeto Java está localizado:
```bash
cd PS/CalculadoraMVC/Calculadora\ Java
```

### 4. Compilar o Projeto
Utilize o Maven para compilar o projeto:
```bash
mvn clean install
```

### 5. Executar o Projeto
Após a compilação, execute o projeto com o seguinte comando:
```bash
mvn exec:java -Dexec.mainClass="br.ifes.calculadoramvc.application.Main"
```

### 6. Interagir com o Menu
Após executar o comando acima, o menu será exibido no terminal. Siga as instruções:
1. Escolha uma operação (Somar, Subtrair, Multiplicar, Dividir).
2. Insira os dois números inteiros solicitados.
3. O resultado será exibido no terminal.

## 📂 Estrutura do Projeto
```
src/main/java/br/ifes/calculadoramvc/
├── application/
│   └── Main.java         # Ponto de entrada principal
├── controller/
│   └── Controller.java   # Coordena os cálculos
├── model/
│   ├── Calculadora.java  # Lógica central de cálculo
│   ├── factories/
│   │   └── Factory.java  # Cria objetos de operação
│   └── operacoes/
│       ├── IOperacao.java   # Interface de operação
│       ├── Somar.java       # Implementação de adição
│       ├── Subtrair.java    # Implementação de subtração
│       ├── Multiplicar.java # Implementação de multiplicação
│       └── Dividir.java     # Implementação de divisão
└── view/
    └── Menu.java         # Interface de usuário
```

## ⚠️ Tratamento de Erros
- **Divisão por Zero**: Caso o usuário tente dividir por zero, uma exceção `ArithmeticException` será lançada com a mensagem "Divisão por zero!".

## 🔧 Tecnologias Utilizadas
- **Java 23**
- **Maven** para gerenciamento de dependências
- **Biblioteca Reflections** para descoberta dinâmica de classes
- **SLF4J** para logging

## 🤝 Como Contribuir
1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## 📜 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo conforme necessário.