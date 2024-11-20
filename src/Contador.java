import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner oTerminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int iParametroUm = oTerminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int iParametroDois = oTerminal.nextInt();
        
        try {
            contar(iParametroUm, iParametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        oTerminal.close();
    }

    static void contar(int iParametroUm, int iParametroDois) throws ParametrosInvalidosException {
        if (iParametroUm > iParametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = iParametroDois - iParametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
