# Calculadora API Monolito

## 📝 Descrição
Esta é uma API simples desenvolvida com FastAPI que realiza operações matemáticas básicas, como soma, subtração, multiplicação e divisão. A API aceita dois números como entrada e retorna o resultado da operação solicitada.

## 🚀 Como Executar a API

### 1. Pré-requisitos
Antes de começar, certifique-se de ter os seguintes itens instalados em sua máquina:
- **Python 3.10 ou superior**
- **Gerenciador de pacotes `pip`**
- **Virtualenv** (opcional, mas recomendado)

### 2. Clonar o Repositório
Clone o repositório para sua máquina local:
```bash
git clone https://github.com/BrenoAmancio/PS.git
```

### 3. Navegar até o Diretório da API
Acesse o diretório onde o arquivo `calculadoraAPI.py` está localizado:
```bash
cd PS/CalculadoraMVC/Calculadora\ API\ monolito
```

### 4. Criar e Ativar um Ambiente Virtual (opcional)
Crie um ambiente virtual para isolar as dependências do projeto:
```bash
python -m venv venv
```
Ative o ambiente virtual:
- No Windows:
  ```bash
  venv\Scripts\activate
  ```
- No Linux/Mac:
  ```bash
  source venv/bin/activate
  ```

### 5. Instalar as Dependências
Instale as dependências necessárias listadas no arquivo `requirements.txt`:
```bash
pip install fastapi uvicorn pydantic
```

### 6. Executar a API
Inicie o servidor FastAPI com o Uvicorn:
```bash
uvicorn calculadoraAPI:app --reload
```

### 7. Acessar a API
Após iniciar o servidor, a API estará disponível em:
- **URL Base**: [http://127.0.0.1:8000](http://127.0.0.1:8000)
- **Documentação Interativa (Swagger)**: [http://127.0.0.1:8000/docs](http://127.0.0.1:8000/docs)
- **Documentação Alternativa (ReDoc)**: [http://127.0.0.1:8000/redoc](http://127.0.0.1:8000/redoc)

## 🛠️ Endpoints Disponíveis

### 1. Soma
- **Rota**: `/soma`
- **Método**: `POST`
- **Entrada**:
  ```json
  {
    "num1": 10,
    "num2": 5
  }
  ```
- **Saída**:
  ```json
  {
    "resultado": 15
  }
  ```

### 2. Subtração
- **Rota**: `/subtracao`
- **Método**: `POST`
- **Entrada**:
  ```json
  {
    "num1": 10,
    "num2": 5
  }
  ```
- **Saída**:
  ```json
  {
    "resultado": 5
  }
  ```

### 3. Multiplicação
- **Rota**: `/multiplicacao`
- **Método**: `POST`
- **Entrada**:
  ```json
  {
    "num1": 10,
    "num2": 5
  }
  ```
- **Saída**:
  ```json
  {
    "resultado": 50
  }
  ```

### 4. Divisão
- **Rota**: `/divisao`
- **Método**: `POST`
- **Entrada**:
  ```json
  {
    "num1": 10,
    "num2": 5
  }
  ```
- **Saída**:
  ```json
  {
    "resultado": 2.0
  }
  ```
- **Erro (Divisão por Zero)**:
  ```json
  {
    "erro": "Divisão por zero não é permitida."
  }
  ```

## 🤝 Como Contribuir
1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## 📌 Requisitos
- Python 3.10 ou superior
- FastAPI
- Uvicorn
- Pydantic

## 📜 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usá-lo e modificá-lo conforme necessário.