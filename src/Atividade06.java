import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args){


        String dono = "";
        double comprimento = 0;
        double largura = 0;
        double tamanhoTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Proprietario: Sr."+dono);
        dono = sc.nextLine();

        System.out.println("Comprimento do terreno: " + comprimento + "metros");
        comprimento = sc.nextDouble();

        System.out.println("Largura do terreno: " + largura + "metros");
        largura = sc.nextDouble();

        tamanhoTotal =  comprimento*largura;

        System.out.println("Tamanho total da propriedade do Sr."+dono + " é de " + tamanhoTotal + "metros");
    }
}
