
package pacote.exercitandojavacomdio;


public class ExercitandoJavaComDio {

    public static void main(String[] args) {
        
        /*
        Exer1 exer1 = new Exer1();
        exer1.escolhaNumeros();
        exer1.contas();
        
        
        
        Exer2 exer2 = new Exer2();
        exer2.horario();
        exer2.mensagens();
        
        
        Exer3 exer3 = new Exer3();
        Exer3.calcular(1000, exer3.getDuasParcelas());
        Exer3.calcular(1000, exer3.getTresParcelas());
        Exer3.calcular(1000, 5);
        */
        
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero_Sobrecarga.area(3);
        Quadrilatero_Sobrecarga.area(5d, 5d);
        Quadrilatero_Sobrecarga.area(7, 8, 9);
        Quadrilatero_Sobrecarga.area(5f, 5f);
    }
}
