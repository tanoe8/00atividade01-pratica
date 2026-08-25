import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        //informações aluno
        String nome = "Alessandro";
        double notaUm = 0;
        double notaDois = 0;
        double notaTres = 0;
        double mediaTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo, " + nome);

        System.out.println("Informe a primeira nota: ");
        notaUm = sc.nextInt();

        System.out.println("Informe a segunda nota:");
        notaDois = sc.nextInt();

        System.out.println("Informe a terceira nota:");
        notaTres = sc.nextInt();

        mediaTotal = (notaUm + notaDois + notaTres) / 3;

        System.out.println("Sua média é " + mediaTotal + (", Alessandro") );;
    }


}