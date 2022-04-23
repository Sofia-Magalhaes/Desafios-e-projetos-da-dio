/*
A partir da hora do dia, informer a mensagem adequada:
Bom dia, Boa tarde e Boa noite
 */
package pacote.exercitandojavacomdio;

import java.util.Scanner;

public class Exer2 {

    private Scanner s;
    String mensagem;
    int horario, hora, min;

    public Exer2() {
        s = new Scanner(System.in);
        mensagem = "";
        horario = 0;
    }

    public void horario() {
        System.out.println("Que horas sao: (não colocar : no horario)");
        hora = s.nextInt();

    }
    
    public void mensagens() {
        if (hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora <= 17) {
            System.out.println("Boa tarde");
        } else if (hora <= 23) {
            System.out.println("Boa noite");
        }else{
            System.out.println("Horario inexiste");
        }
    }

}
