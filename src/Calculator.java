import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double num1 = sc.nextDouble();
        System.out.println("DIgite o segundo numero");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação (+, /, -, *,)");
        char operacao = sc.next() .charAt(0);

        if (operacao == '+'){
            System.out.println(num1 + num2);
        } else if (operacao == '/') {
            System.out.println(num1 / num2);
        }else if (operacao == '*') {
            System.out.println(num1 * num2);
        }else if (operacao == '-') {
            System.out.println(num1 - num2);
        }

    }
}
