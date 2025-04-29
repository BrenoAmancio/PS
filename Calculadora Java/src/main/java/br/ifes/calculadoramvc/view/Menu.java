package br.ifes.calculadoramvc.view;

import br.ifes.calculadoramvc.controller.Controller;
import br.ifes.calculadoramvc.model.operacoes.IOperacao;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.Set;

public class Menu {
    public void imprimirMenu() {
        Reflections reflections = new Reflections("br.ifes.calculadoramvc.model.operacoes");

        Set<Class<? extends IOperacao>> ops = reflections.getSubTypesOf(IOperacao.class);

        System.out.print("Digite uma das seguintes opções:\n");
        for (Class<?> opcao : ops) {
            System.out.print(" - " + opcao.getSimpleName() + "\n");
        }

        Scanner s = new Scanner(System.in);

        String opcaoSelecionada = s.nextLine();

        System.out.println("Digite o primeiro operando: ");
        Integer valor1 = s.nextInt();

        System.out.println("Digite o segundo operando: ");
        Integer valor2 = s.nextInt();

        Controller controller = new Controller();
        Integer resultado = controller.calcular(opcaoSelecionada, valor1, valor2);

        System.out.println("O resultado da operação é: " + resultado);
    }
}
