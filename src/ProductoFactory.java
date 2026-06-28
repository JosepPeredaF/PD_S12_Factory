abstract class LaptopFactory {

    public abstract Laptop crearLaptop();

    public void ejecutarPrueba() {
        Laptop laptop = crearLaptop();
        laptop.ejecutarPrueba();
    }
}