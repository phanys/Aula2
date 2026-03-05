import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        int valor1 = 0;
        int valor2 = 0;
        int soma = 0;

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        int numeroRecebido1 = lerValor.nextInt();

        System.out.println("Insira o segundo valor: ");
        int numeroRecebido2 = lerValor.nextInt();

        valor1 = numeroRecebido1;
        valor2 = numeroRecebido2;

        soma = valor1 + valor2;

        System.out.println("A somas dos valores é igual a: " + soma);
    }
}
