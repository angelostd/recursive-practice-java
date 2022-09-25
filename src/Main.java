import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.print("=> Bienvenid@ a la calculadora de potencias! <=\n>>: Introduce la base\n<<: ");
            int base = reader.nextInt();
            System.out.print("\n>>: Introduce el exponente\n<<: ");
            int exponent = reader.nextInt();
            System.out.println("\n=> El resultado es : " + power(base, exponent));
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ha ocurrido un error");
        }
    }

    public static int power(int base, int exponent) {
        return (exponent <= 0) ? 1 : base * power(base, exponent - 1);
    }
}