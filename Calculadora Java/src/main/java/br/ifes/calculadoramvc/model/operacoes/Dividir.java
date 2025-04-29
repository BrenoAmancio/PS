package br.ifes.calculadoramvc.model.operacoes;

public class Dividir implements IOperacao {
    public Integer calcular(Integer valor1, Integer valor2) {
        Integer resultado = 0;
        try {
            resultado = valor1 / valor2;
        } catch (ArithmeticException e) {
            System.out.println("Tentativa de divisão por zero");
        }
        return resultado;
    }
}
