import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");

        String nome = scanner.nextLine();

        System.out.println("Qual sua idade?");

        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println(String.format("Nome: %s, Idade: %d", nome, idade));
    }
}