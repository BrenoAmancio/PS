package br.ifes.calculadoramvc.model.factory;

import br.ifes.calculadoramvc.model.operacoes.IOperacao;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    public IOperacao create(String classe) {
        Object resultado = null;

        try {
            resultado = Class.forName("br.ifes.calculadoramvc.model.operacoes." + classe).getDeclaredConstructor().newInstance();

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.print("Ocorreu um erro na criação da operação");
        }

        return (IOperacao) resultado;
    }
}
