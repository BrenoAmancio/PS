package br.ifes.calculadoramvc.model;

import br.ifes.calculadoramvc.model.factory.Factory;
import br.ifes.calculadoramvc.model.operacoes.IOperacao;

public class Calculadora {
    public Integer calcular(String opcao, Integer valor1, Integer valor2) {
        String classe = opcao.substring(0, 1).toUpperCase() + opcao.substring(1).toLowerCase();

        Factory factory = new Factory();
        IOperacao operacao = factory.create(classe);

        return operacao.calcular(valor1, valor2);
    }
}
