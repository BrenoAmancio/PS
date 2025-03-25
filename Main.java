import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aux = 0;
        float op1, op2;

        do {
            System.out.println("Insira uma opção:\n 1. Soma\n 2. Subtração\n 3. Multiplicação\n 4. Divisão\n 5. Sair");
            aux = s.nextInt();

            if (aux == 1) {
                System.out.println("insira o primeiro operador:");
                op1 = s.nextFloat();

                System.out.println("Insira o segundo operador:");
                op2 = s.nextFloat();

                System.out.println("O resultado é: " + (op1 + op2));
            } else if (aux == 2) {
                System.out.println("insira o primeiro operador:");
                op1 = s.nextFloat();

                System.out.println("Insira o segundo operador:");
                op2 = s.nextFloat();

                System.out.println("O resultado é: " + (op1 - op2));
            } else if (aux == 3) {
                System.out.println("insira o primeiro operador:");
                op1 = s.nextFloat();

                System.out.println("Insira o segundo operador:");
                op2 = s.nextFloat();

                System.out.println("O resultado é: " + (op1 * op2));
            } else if (aux == 4) {
                do {
                    System.out.println("insira o primeiro operador:");
                    op1 = s.nextFloat();

                    System.out.println("Insira o segundo operador:");
                    op2 = s.nextFloat();
                } while (op2 == 0);

                System.out.println("O resultado é: " + (op1 / op2));
            }
        } while (aux != 5);

        System.out.println("Até mais!");
    }
}