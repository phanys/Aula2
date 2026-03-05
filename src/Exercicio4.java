import java.util.Scanner;

public class Exercicio4 {
    static void main() {

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int numeroRecebido1 = lerValor.nextInt();


        System.out.println("Insira o segundo número: ");
        int numeroRecebido2 = lerValor.nextInt();


        System.out.println("Insira o terceiro número: ");
        int numeroRecebido3 = lerValor.nextInt();


       int soma = numeroRecebido1 + numeroRecebido2 + numeroRecebido3;
       float resultado = soma / 3;

        System.out.println("A média aritimética desses números é igual a: " + resultado);


    }
}
