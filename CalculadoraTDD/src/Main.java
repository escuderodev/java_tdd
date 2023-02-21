import java.util.Scanner;
import br.com.escuderodev.domain.Calculadora;

public class Main {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        valor1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        valor2 = scan.nextInt();

        System.out.println(valor1 + " + " + valor2 + " = " + calculadora.somar(valor1,valor2));
    }
}