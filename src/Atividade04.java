import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        String nome = "";
        int anoNascimento = 0;
        int anoAtual = 0;
        int idade = 0;

        Scanner sc =  new Scanner(System.in);

        System.out.println("Digite teu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o ano em que nasceu: ");
        anoNascimento = sc.nextInt();

        System.out.println("Digite o ano em que estamos: ");
        anoAtual = sc.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println("o nome do individuo é: " + nome);
        System.out.println("Ele nasceu em " + anoNascimento);
        System.out.println("Ele tem aproximadamente " + idade + " anos");
}
    }