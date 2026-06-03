import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner input = new Scanner(System.in);
       int numero = input.nextInt();
       for (int i=0; i <=10; i++) {

           System.out.println(numero*i);;

       }
    }
}

