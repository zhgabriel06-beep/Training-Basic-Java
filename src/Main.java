import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        double media = 0;
        int i = 0;
        double nota;
        int contador = 0;
        ArrayList<Double> lista = new ArrayList<>();
        for(i = 0; i < 3; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite as nota dos alunos ");
            nota = input.nextDouble();
            lista.add(nota);
            media += nota;
        }
        media /= 3;

        for(i = 0; i < 3; i++){
            if(lista.get(i) > media) {
                contador++;
            }
            System.out.println("Media dos alunos foram"+ media);
            System.out.println("Ficaram " + contador + " Acima da media");
        }
    }
}

