package br.ifes.calculadoramvc.model.operacoes;

public class Multiplicar implements IOperacao {
    public Integer calcular(Integer valor1, Integer valor2) {
        return valor1 * valor2;
    }
}
