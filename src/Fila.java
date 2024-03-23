import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        String opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "1 - Adicionar elemento na fila\n2 - Remover elemento da fila\n3 - Sair", "Escolha uma opção", JOptionPane.QUESTION_MESSAGE);

            switch (opcao) {
                case "1":
                    String elementoStr = JOptionPane.showInputDialog(null, "Digite o elemento a ser adicionado na fila:", "Adicionar elemento", JOptionPane.QUESTION_MESSAGE);
                    int elemento = Integer.parseInt(elementoStr);
                    fila.add(elemento);
                    JOptionPane.showMessageDialog(null, "Elemento adicionado: " + elemento, "Informação", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "2":
                    if (!fila.isEmpty()) {
                        int removido = fila.remove();
                        JOptionPane.showMessageDialog(null, "Elemento removido: " + removido, "Informação", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "A fila está vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saindo...", "Informação", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            JOptionPane.showMessageDialog(null, "Elementos na fila: " + fila, "Informação", JOptionPane.INFORMATION_MESSAGE);

        } while (!opcao.equals("3"));
    }
}

