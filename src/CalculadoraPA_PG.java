import java.util.Scanner;

public class CalculadoraPA_PG {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int valorInicial = entrada.nextInt();

        System.out.print("Digite o valor da raiz: ");
        int raiz = entrada.nextInt();

        System.out.print("Deseja calcular uma P.A. ou uma P.G.?: ");
        String escolha = entrada.next();

        System.out.println("Sequência dos 10 primeiros valores:");

        if (escolha.equalsIgnoreCase("PA")) {
            int termo = valorInicial;
            for (int i = 0; i < 10; i++) {
                System.out.print(termo);
                if (i < 9) System.out.print(", ");
                termo += raiz;
            }
        } else if (escolha.equalsIgnoreCase("PG")) {
            int termo = valorInicial;
            for (int i = 0; i < 10; i++) {
                System.out.print(termo);
                if (i < 9) System.out.print(", ");
                termo *= raiz;
            }
        } else {
            System.out.println("Opção inválida..");
        }

        System.out.println();
    }
}