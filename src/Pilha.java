import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Empilhar");
            System.out.println("2. Desempilhar");
            System.out.println("3. Exibir toda a pilha");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser empilhado: ");
                    int valor = scanner.nextInt();
                    pilha.push(valor);
                    System.out.println("Valor empilhado com sucesso!");
                    break;
                case 2:
                    if (!pilha.isEmpty()) {
                        int topo = pilha.pop();
                        System.out.println("Valor desempilhado: " + topo);
                    } else {
                        System.out.println("A pilha vazia, não é possível desempilhar.");
                    }
                    break;
                case 3:
                    if (!pilha.isEmpty()) {
                        System.out.println("Conteúdo da pilha:");
                        for (int i = pilha.size() - 1; i >= 0; i--) {
                            System.out.println(pilha.get(i));
                        }
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}