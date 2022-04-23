/*
Calcule as 4 operações basicas: 
soma
subtração
multiplicação
divisão
sempre 2 valores devem ser mantidos
 */
package pacote.exercitandojavacomdio;
import java.util.Scanner;

public class Exer1 {

    private int num1, num2;
    private int soma, subtracao, multiplicacao, divisao;
    private Scanner s;

    public Exer1() {
        num1 = 0;
        num2 = 0;
        soma = 0;
        subtracao = 0;
        multiplicacao = 0;
        divisao = 0;
        s = new Scanner(System.in);
    }

    public void escolhaNumeros() {
        System.out.println("Digite um numero");
        num1 = s.nextInt();
        System.out.println("Digite um numero");
        num2 = s.nextInt();
    }

    public void contas() {
        System.out.println("\nAs 4 Operacoes Basicas");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtracao: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplicacao: " + num1 + " X " + num2 + " = " + (num1 * num2));
        System.out.println("Divisao: " + num1 + " / " + num2 + " = " + (num1 / num2));

    }
}
