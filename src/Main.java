public class Main {
    public static void main(String[] args) {
        try {
            Display display = new Display();    // Create a display object
            display.showMenu();                 // Call to show-menu method
            display = null;                     // Set free the memory reference
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ha ocurrido un error: " + e);
        }
    }
}