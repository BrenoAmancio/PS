from calculadoraAPI import app

client = TestClient(app)

def test_soma():
    response = client.post("/soma", json={"num1": 10, "num2": 5})
    assert response.status_code == 200
    assert response.json() == {"resultado": 15}

def test_subtracao():
    response = client.post("/subtracao", json={"num1": 10, "num2": 5})
    assert response.status_code == 200
    assert response.json() == {"resultado": 5}

def test_multiplicacao():
    response = client.post("/multiplicacao", json={"num1": 10, "num2": 5})
    assert response.status_code == 200
    assert response.json() == {"resultado": 50}

def test_divisao():
    response = client.post("/divisao", json={"num1": 10, "num2": 5})
    assert response.status_code == 200
    assert response.json() == {"resultado": 2.0}

def test_divisao_por_zero():
    response = client.post("/divisao", json={"num1": 10, "num2": 0})
    assert response.status_code == 200
    assert response.json() == {"erro": "Divisão por zero não é permitida."}