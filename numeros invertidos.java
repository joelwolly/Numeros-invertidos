import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 3 algarismos:");

        int numero = scanner.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = 10;

        int numeroInvertido = unidade * 100 + dezena * 10 + centena;

        System.out.println("O número invertido é: " + numeroInvertido);

        scanner.close();

    }
}
