import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = input.nextInt();

        System.out.println("Digite outro numero:");
        int num2 = input.nextInt();

        try {

            System.out.println(num / num2);

        } catch (ArithmeticException e) {

            System.out.println("Não é possível dividir por zero!");
        }
    }
}