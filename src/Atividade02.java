import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args){

        //variaveis
        int valorUm = 0;
        int valorDois = 0;
        Scanner sc = new Scanner(System.in);

        //valores informados
        System.out.println("Informe o primeiro valor: ");
        valorUm = sc.nextInt();

        System.out.println("Informe o segundo valor:");
        valorDois = sc.nextInt();

        //operações
        int soma = valorUm + valorDois;
        int subtracao = valorUm - valorDois;
        int multiplicacao = valorUm * valorDois;
        double divisao = valorUm / valorDois;

        //resultados
        System.out.println("SOMA == " + soma);
        System.out.println("SUBTRAÇÃO == " + subtracao);
        System.out.println("MULTIPLICAÇÃO == " + multiplicacao);
        System.out.println("DIVISÃO == " + divisao);

    }


}
