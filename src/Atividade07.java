import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        String motorista = "";
        double distanciaKm = 0;
        double litrosConsumidos = 0;
        double consumo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("O motorista é: " + motorista);
        motorista = sc.nextLine();

        System.out.println("Distancia em KM: " + distanciaKm);
        distanciaKm = sc.nextDouble();

        System.out.println("Litros consumidos: " + litrosConsumidos);
        litrosConsumidos = sc.nextDouble();

        consumo = distanciaKm/litrosConsumidos;

        System.out.println("Km/L aproximados de " + consumo);
    }
}