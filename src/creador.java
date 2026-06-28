class BasicaFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopBasica("Dell Latitude", "", 2020, "intel core i7", 14);
    }
}

class GamerFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopGamer("Macbook air", "", 2017, "Silicon M1", 13);
    }
}

class ProfesionalFactory extends LaptopFactory {
    @Override
    public Laptop crearLaptop() {
        return new LaptopProfesional("Macbook Pro", "", 2022, "Apple Silicon M2", 16);
    }
}