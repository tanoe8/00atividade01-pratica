import java.util.Scanner;

public class Atividade01 {

    //public static é a segurança da classe, espaço publico "public"
    public static void main(String[] args) {

        //começo das variaveis
        String nome = "";
        String curso = "";
        int periodo = 0;
        int idade = 0;

        //Scanner é classe
        //sc é o nome do objeto
        //new instance cria um objeto
        //new Scanner indica o tipo do objeto criado
        //(System.in) é parametro
        //lembrar do IMPORT!!!!!!
        Scanner sc =  new Scanner(System.in);

        System.out.println("qual teu nome?");
        nome = sc.nextLine();

        System.out.println("qual teu curso?");
        curso = sc.nextLine();

        System.out.println("qual periodo?");
        periodo = sc.nextInt();

        System.out.println("qual tua idade?");
        idade = sc.nextInt();

        //respostas
        System.out.println("O nome do usuário é " + nome);
        System.out.println("O curso do usuário é " + curso);
        System.out.println("O período do usuário é " + periodo);
        System.out.println("A idade do usuário é " + idade + " anos");
    }


}


