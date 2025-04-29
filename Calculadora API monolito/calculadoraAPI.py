from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI()

class Operandos(BaseModel):
    num1: float
    num2: float

@app.post("/soma")
def soma(operando: Operandos):
    return {"resultado": operando.num1 + operando.num2}

@app.post("/subtracao")
def subtracao(operando: Operandos):
    return {"resultado": operando.num1 - operando.num2}

@app.post("/multiplicacao")
def multiplicacao(operando: Operandos):
    return {"resultado": operando.num1 * operando.num2}

@app.post("/divisao")
def divisao(operando: Operandos):
    if operando.num2 == 0:
        return {"erro": "Divisão por zero não é permitida."}
    return {"resultado": operando.num1 / operando.num2}