public class Main {
    public static void main(String[] args) {

        LaptopFactory factory;

        factory = new GamerFactory();
        factory.ejecutarPrueba();


        factory = new BasicaFactory();
        factory.ejecutarPrueba();

        factory = new ProfesionalFactory();
        factory.ejecutarPrueba();
    }
}
