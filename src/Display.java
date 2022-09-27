import java.util.Scanner;

public class Display {

    public Display() {
    }

    public void showMenu() {
        Scanner reader = new Scanner(System.in);    // Create a Scanner object
        Exponential exp = new Exponential();        // Create a Exponential object

        System.out.print("=> Bienvenid@ a la calculadora de potencias! <=\n>>: Introduce la base\n<<: ");
        int base = reader.nextInt();
        System.out.print("\n>>: Introduce el exponente\n<<: ");
        int exponent = reader.nextInt();
        System.out.println("\n=> El resultado es : " + exp.power(base, exponent));

        reader.close();     // Close the Scanner object
        exp = null;         // Set free the memory reference
    }
}
