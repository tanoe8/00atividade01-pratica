import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args){

        String funcionario = "";
        double horasEscravizadas = 0;
        double  valorHora = 0;
        double salario = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome colaborardor: " + funcionario);
        funcionario = sc.nextLine();

        System.out.println("Horas escravizadas do mesmo: " + horasEscravizadas);
        horasEscravizadas = sc.nextInt();

        System.out.println("valor da hora: " + valorHora);
        valorHora = sc.nextInt();

        salario =  horasEscravizadas*valorHora;

        System.out.println("O valor do horario do colaborador é: " + salario);




    }
}