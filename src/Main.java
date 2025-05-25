import java.util.Scanner;

public class Main {//declara clase publica llamada main
    public static void main(String[] args) {//declara metodo void publico estatico
        System.out.println("Bienvenido al conversor de temperatura");//imprime texto en pantalla
        System.out.println("Por favor elige tu opción:" );

        Scanner scanner = new Scanner(System.in);
        int eleccionDelTipoDeGrados = 0;
        double gradosCelsius = 0;
        double gradosFahrenheit = 0;
        double convierteCelsiusEnFahrenheit = (gradosCelsius * 1.8) + 32;
        double convierteFahrenheitEnCelsius = (gradosFahrenheit - 32) / 1.8;

        System.out.println("Pulsa 1 para convertir grados Celsius a Fahrenheit");
        System.out.println("Pulsa 2 para convertir grados Fahrenheit a Celsius");
        eleccionDelTipoDeGrados = scanner.nextInt();

        if (eleccionDelTipoDeGrados == 1){
            System.out.println("Ahora ingresa los grados Celsius que quieras convertir a Fahrenheit");
            gradosCelsius = scanner.nextInt();
            System.out.println("El resultado de la conversión de " + gradosCelsius + " grados Celsius es de " + convierteCelsiusEnFahrenheit + " grados Fahrenheit");

        } else if (eleccionDelTipoDeGrados == 2){
            System.out.println("Ahora ingresa los grados Fahrenheit que quieras convertir a Celsius");
            gradosFahrenheit = scanner.nextInt();
            System.out.println("El resultado de la conversión de " + gradosFahrenheit + " grados Fahrenheit, es de " + convierteFahrenheitEnCelsius + " grados Celsius");

        } else {
            System.out.println("Tu elección no corresponde a ninguna de las 2 alternativas ofrecidas");
        }
    }
}