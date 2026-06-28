class LaptopGamer extends Laptop{

    public LaptopGamer(String marca, String modelo, int anioFabricacion, String tipoProcesador, double tamanoPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop para Gamer");
        System.out.println("Laptop para Gamer");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Anio de Fabricacion: " + anioFabricacion);
        System.out.println("Procesador: " + tipoProcesador);
        System.out.println("Tamano de la Pantalla: " + tamanoPantalla);
        System.out.println();
    }
}

class LaptopBasica extends Laptop{

    public LaptopBasica(String marca, String modelo, int anioFabricacion, String tipoProcesador, double tamanoPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Anio de Fabricacion: " + anioFabricacion);
        System.out.println("Procesador: " + tipoProcesador);
        System.out.println("Tamano de la Pantalla: " + tamanoPantalla);
        System.out.println();
    }
}

class LaptopProfesional extends Laptop{

    public LaptopProfesional(String marca, String modelo, int anioFabricacion, String tipoProcesador, double tamanoPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanoPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Corriendo programas en una Laptop Profesional");
        System.out.println("Laptop para Profesional");
        System.out.println("Marca y Modelo: " + marca + " " + modelo);
        System.out.println("Anio de Fabricacion: " + anioFabricacion);
        System.out.println("Procesador: " + tipoProcesador);
        System.out.println("Tamano de la Pantalla: " + tamanoPantalla);
        System.out.println();
    }

}