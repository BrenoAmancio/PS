package br.ifes.calculadoramvc.controller;

import br.ifes.calculadoramvc.model.Calculadora;

public class Controller {

    public Integer calcular(String opcao, Integer valor1, Integer valor2)  {

        Calculadora calculadora = new Calculadora();

        return calculadora.calcular(opcao, valor1, valor2);

    }
}